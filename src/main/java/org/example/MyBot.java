package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;

public class MyBot extends TelegramLongPollingBot {
    DBConnection dbConnection = new DBConnection();
    KeyBoardButton keyBoardButton = new KeyBoardButton();
    KeyBoardButton2 keyBoardButton2 = new KeyBoardButton2();
    CRUDService crudService = new CRUDService();
    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
    UserRegister userRegister = new UserRegister();
    Role role;

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            Long chatId = message.getChatId();
            String text = message.getText();
            String[] words = text.split(" ");

            if (role == null) {
                role = Role.USER; // Assign a default role if null
            }

            switch (text){
                case "/start" ->{
                    sendMessage(chatId,"Welcome to Chopar pizza! \uD83C\uDF55" +
                            "Which city do you live in?\n" +
                            "Please, choose a city:");
                    break;
                }
                case "Tashkent" ->{
                    sendMessageReply(chatId,"Empty menu");
                    break;
                }
                case "Buyurtma berish \uD83C\uDF55" ->{
                    sendMessageMenu(chatId,"Do u prefer Order Takeout\uD83D\uDE4B\u200D♂\uFE0F or Order Delivery\uD83D\uDE99");
                    break;
                }
                case "\uD83D\uDCD6 Buyurtmalar tarixi" -> {
                    sendBuyurtmalarTarixi(chatId,"Ro'yxatdan o'tish uchun telefon raqamingizni kiriting!\n" +
                            "Misol uchun, +998xx xxx xx xx");
                    break;
                }
                case "\uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0F Jamoamizga qo'shiling" -> {
                    sendJamoa(chatId,"Ahil jamoamizda ishlashga taklif qilamiz! Telegramdan chiqmay, shu yerning o'zida anketani to'ldirish uchun quyidagi tugmani bosing.");
                    break;
                }
                case "☎\uFE0F Chopar bilan aloqa" -> {
                    sendAloqa(chatId,"Agar siz bizga yozsangiz yoki sharh qoldirmoqchi bo'lsangiz, xursand bo'lamiz.");
                    break;
                }
                case "⚙\uFE0FSozlash ℹ\uFE0F Ma'lumotlar" -> {
                    sendSozlama(chatId,"Harakatni tanlang:");
                    break;
                }
                case "\uD83C\uDFC3 Olib ketish" -> {
                    sendOlibKetish(chatId,"Qayerdasiz \uD83D\uDC40? Agar lokatsiyangizni\uD83D\uDCCD yuborsangiz, sizga eng yaqin filialni aniqlaymiz");
                    break;
                }
                case "\uD83D\uDE99 Yetkazib berish" -> {
                    sendOlibKetish(chatId,"Qayerdasiz \uD83D\uDC40? Agar lokatsiyangizni\uD83D\uDCCD yuborsangiz, sizga eng yaqin filialni aniqlaymiz");
                    break;
                }
                case "Filialni tanlang" ->{
                    sednFillialtanla(chatId,"Qaysi filialdan olib ketishni tanlang");
                    break;
                }
                case "Atlas Chimgan" -> {
                    sendAtlas(chatId,"Atlas Chimgan\n" +
                            "\uD83D\uDCF1 712051111\n" +
                            "Ish vaqti:\n" +
                            "10:00 – 22:00\n" +
                            "Toshkent shahri, M.Ulug’bek tumani.\n" +
                            "Mo’ljal: «Atlas Chimgan» savdo markaz\n" +
                            "\uD83D\uDE97 yetkazish xizmati\n" +
                            "\uD83C\uDFF0 bolalar maydonchasi\n" +
                            "\uD83C\uDD7F\uFE0F avtoturargoh\n" +
                            "\n" +
                            "Nimadan boshlaymiz?");
                    break;
                }
                case "\uD83C\uDF2F Pide va Lavash" -> {
                    sendPide(chatId,"Nimadan boshlaymiz?");
                    break;
                }
                case "\uD83C\uDF71 Setlar" ->{
                    sendSet(chatId,"Nimadan boshlaymiz?");
                    break;
                }
                case "\uD83C\uDF55 50/50" ->{
                    sendFifty(chatId,"Nimadan boshlaymiz?");
                    break;
                }

                case "\uD83C\uDF55 Pitsa" ->{
                    sendPizza(chatId,"Nimadan boshlaymiz?");
                    break;
                }

                case "\uD83C\uDF5F Sneklar" ->{
                    sendSnack(chatId,"Nimadan boshlaymiz?");
                    break;
                }

                case "\uD83C\uDF45 Souslar" ->{
                    sendSous(chatId,"Nimadan boshlaymiz?");
                    break;
                }

                case "\uD83C\uDF70 Shirin pitsa" ->{
                    sendSweet(chatId,"Nimadan boshlaymiz?");
                    break;
                }

                case "\uD83E\uDD57 Salatlar" ->{
                    sendSalad(chatId,"Nimadan boshlaymiz?");
                    break;
                }
                case "\uD83E\uDD64 Ichimliklar" ->{
                    sendDrink(chatId,"Nimadan boshlaymiz?");
                    break;
                }
                case "VEGETARIAN LAVASH" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/2024-12-13 15.50.40.jpg","VEGETARIAN LAVASH \n" +
                            "Lavash xamir, mozzarella pishlog’i, shampinyon qo'ziqorini, sarxil pomidor, bulg’or qalampiri, qora va yashil zaytun, murch va oq sedana \n" +
                            "Narxi: 25 000 soʻm");
                    break;
                }
                case "TOVUQ STEYK LAVASH" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/Tovuqsteyk","TOVUQ STEYK LAVASH \n" +
                            "Lavash xamir, mozzarella pishlog’i, tovuq steyki, sarxil pomidor, shampinyon qo'ziqorini, french sous, oq sedana \n" +
                            "Narxi: 30 000 soʻm");
                    break;
                } case "PISHLOQLI PIDE" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/PishloqliPide","PISHLOQLI PIDE \n" +
                            "Mozzarella pishlog'i, asal, oq sedana \n" +
                            "Narxi: 45 000 soʻm");
                    break;
                }case "GO’SHTLI PIDE" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/GoshtPide","GO’SHTLI PIDE \n" +
                            "Mozzarella pishlog’i, mol go'shti steyki, qizil va yashil bulg’or qalampiri, pomidor, oq sedana \n" +
                            "Narxi: 50 000 soʻm");
                    break;
                }case "1+1 Pepperoni 30" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/1+1","1+1 Pepperoni 30 \n" +
                            "Ikkita Pepperoni 30 sm bittasini narxida! \n" +
                            "Narxi: 80 000 soʻm");
                    break;
                }case "SNEK SET" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/SnekSte","SNEK SET \n" +
                            "Ishtaha ochar, qaynoq to’plam. Maxsus sousdagi qanotchalar, qarsildoq fri kartoshkasi, pishloqli tovuq qalamchalari va xushta'm jaydari kartoshka. Ushbu to'plamni xarid qilganda 10.000 so'm kamroq pul to'lab, 10% mablag'ingizni tejab qolasiz \n" +
                            "Narxi: 97 000 soʻm");
                    break;
                }case "YANGI MUMTOZ SET" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/mumtozSet","YANGI MUMTOZ SET \n" +
                            "Ikki karra pepperoni 25 smJulyen 25 smBarbekyu 25 smCoca-cola 1.5 L10% chegirma \n" +
                            "Narxi: 158 000 soʻm");
                    break;
                }case "Vegetarian" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/VeganPizza","VEGETARIAN 35 sm \n" +
                            "Maxsus tomatli sous, mozzarella pishloq, qo'ziqorin, qizil va yashil bulg'or qalampiri, qora va yashil zaytun, jo'xori \n" +
                            "Narxi: 75 000 soʻm");
                    break;
                }case "Meksika" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/MeksikaPizza","MEKSIKA 35 sm \n" +
                            "Maxsus tomatli sous, mozzarella pishloq, dudlangan kolbasa, qo'ziqorin, qizil bulg'or qalampiri, xalapeno \n" +
                            "Narxi: 85 000 soʻm");
                    break;
                }case "Bayram" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/BayramPizza","BAYRAM 30 sm \n" +
                            "Maxsus pomidor sousi, mozzarella pishloqi, go'sht aralashmasi( mol go'shti, qo'zichoq), qizil piyoz, zaytun, rayhon. \n" +
                            "Narxi: 104 000 soʻm");
                    break;
                }case "Go'shtli" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/goshtliPizza","GO‘SHTLI 30 sm \n" +
                            "Maxsus pomidor sousi, mozzarella pishloqi, mol go‘shti, tovuq filesi, qizil va yashil bulg‘or qalampiri, pomidor \n" +
                            "Narxi: 94 000 soʻm");
                    break;
                }case "FRI KARTOSHKASI" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/fri","FRI KARTOSHKASI \n" +
                            "Ishtahaochar, qarsildoq fri kartoshkasi \n" +
                            "Narxi: 15 000 soʻm");
                    break;
                }
                case "JAYDARI KARTOSHKA" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/Jaydari","JAYDARI KARTOSHKA \n" +
                            "Ziravorlar bilan pishirilgan, ishtaha ochar jaydari kartoshka bo‘laklari \n" +
                            "Narxi: 17 000 soʻm");
                    break;
                }case "TOVUQ NAGETS, 6 dona" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/Tovuq","TOVUQ NAGETS, 6 dona \n" +
                            "Maxsus panirovka bilan qoplangan, tovuq qiymasidan tayyorlangan mazali naggetslar \n" +
                            "Narxi: 24 000 soʻm");
                    break;
                }case "PISHLOQLI TOVUQ QALAMCHALARI" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/Sir tovuq","PISHLOQLI TOVUQ QALAMCHALARI \n" +
                            "Maydalangan tovuq filesidan tayyorlangan pishloqli qalamchalar. 6 dona \n" +
                            "Narxi: 32 000 soʻm");
                    break;
                }case "KETCHUP SOUS" ->{
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/Ketchup","KETCHUP SOUS \n" +
                            "Sevimli Ketchup sous \n" +
                            "Narxi: 3 000 soʻm");
                    break;
                }case "CHILI SOUS" ->{
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/Chili","CHILI SOUS \n" +
                            "Achchiq Chili sousi \n" +
                            "Narxi: 4 000 soʻm");
                    break;
                }case "FRENCH SOUS"->{
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/french","FRENCH SOUS \n" +
                            "Xushta'm French sous \n" +
                            "Narxi: 4 000 soʻm");
                    break;
                }case "SEZAR SOUS" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/Sezar","SEZAR SOUS \n" +
                            " \n" +
                            "Narxi: 4 000 soʻm");
                    break;
                }
                case "SHOKOLADLI 25 SM" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/25cm","SHOKOLADLI 25 SM \n" +
                            "Shokoladli pasta, marshmellou, oq sedana \n" +
                            "Narxi: 36 000 soʻm");
                    break;
                }
                case "SHOKOLADLI 30 SM" -> {
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/25cm","SHOKOLADLI 30 SM \n" +
                            "Shokoladli pasta, marshmellou, oq sedana \n" +
                            "Narxi: 42 000 soʻm");
                    break;
                }case "GREKCHA SALAT" ->{
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/Grekcha","GREKCHA SALAT \n" +
                            "Sarxil salat barglari, pomidor, bodiring, zaytun va fetaksa pishlog‘I, limon va rayhonli souslar. 240 g \n" +
                            "Narxi: 30 000 soʻm");
                    break;
                }case "SEZAR SALATI" ->{
                    sendPhoto(chatId,"/Users/macbok/IdeaProjects/ExamTgBot/src/main/resources/Exam photos/SezarSalat","SEZAR SALATI \n" +
                            "Parmezan pishlog‘I, yumshoqqina tovuq filesi, сherri pomidori, quritilgan non, aysberg salat barglari va sezar sousi. 220 g \n" +
                            "Narxi: 30 000 soʻm");
                    break;
                }
            }
            if (role.equals(Role.ADMIN) && words[0].equals("/createProduct")){
                crudService.create(words[1], words[2]);
            } else if (role.equals(Role.ADMIN) && words[0].equals("/updateProduct")) {
                crudService.updateProducts(Integer.parseInt(words[1]), words[2], words[3]);
            } else if (role.equals(Role.ADMIN) && words[0].equals("/deleteProduct")) {
                crudService.delete(Integer.parseInt(words[1]));
            } else if (words[0].equals("/register")){
                userRegister.register(words[1], words[2],words[3]);
                sendMessage(chatId,"Muvaffaqiyatli ro'yxatdan o'tdingiz");
            }
        }
    }

    private void sendPhoto(Long chatId, String s,String caption) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File(s)));
        sendPhoto.setCaption(caption);
        sendPhoto.setReplyMarkup(keyBoardButton2.sendInline(chatId));
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendDrink(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton2.ButtonDrink(chatId));
        try {
            execute(messageInline);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendSalad(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton2.ButtonSalad(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendSweet(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton2.ButtonSweetPizza(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendSous(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton2.ButtonSous(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendSnack(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton2.ButtonSnack(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendPizza(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton2.ButtonPizza(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendFifty(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton2.Button50(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendSet(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton2.ButtonSet(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendPide(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton2.ButtonPideVaLavash(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendAtlas(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton.Button(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sednFillialtanla(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton.sendChoosFilial(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendOlibKetish(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton.sendPIYDEL(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendSozlama(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton.sendsozlamaButton(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendAloqa(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton.sendAloqaButton(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendJamoa(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton.sendJamoa(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void sendBuyurtmalarTarixi(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton.sendBuyurtmaTarixi(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendMessageMenu(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton.sendDeliverButton(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendMessageReply(Long chatId, String s) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(s);
        messageInline.setReplyMarkup(keyBoardButton.sendDelivery(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(long chatId, String message) {
        SendMessage messageInline = new SendMessage();
        messageInline.setChatId(chatId);
        messageInline.setText(message);
        messageInline.setReplyMarkup(keyBoardButton.sendBtns(chatId));

        try {
            execute(messageInline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "t.me/somethinga23_bot";
    }

    @Override
    public String getBotToken() {
        return "7723298991:AAFQIHHDCiGb6SAgU76buX_ZPHQM6Rmd00Q";
    }
}
