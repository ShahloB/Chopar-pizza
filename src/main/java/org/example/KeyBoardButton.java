package org.example;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class KeyBoardButton {

    public static ReplyKeyboardMarkup sendBtns(Long chatId) {

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("Tashkent");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Andijan");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("Fergana");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("Margilan");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("Chirchiq");

        KeyboardButton keyboardButton6 = new KeyboardButton();
        keyboardButton6.setText("Qoqand");

        KeyboardButton keyboardButton7 = new KeyboardButton();
        keyboardButton7.setText("Nukus");

        KeyboardButton keyboardButton8 = new KeyboardButton();
        keyboardButton8.setText("Xorezm");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton1);
        keyboardRow.add(keyboardButton2);
        keyboardRow.add(keyboardButton3);
        keyboardRow.add(keyboardButton4);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton5);
        keyboardRow2.add(keyboardButton6);
        keyboardRow2.add(keyboardButton7);
        keyboardRow2.add(keyboardButton8);


        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public static ReplyKeyboardMarkup sendDelivery(Long chatId) {

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("Buyurtma berish \uD83C\uDF55");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("☎\uFE0F Chopar bilan aloqa");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("\uD83D\uDCD6 Buyurtmalar tarixi");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("\uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0F Jamoamizga qo'shiling");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("⚙\uFE0FSozlash ℹ\uFE0F Ma'lumotlar");


        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton1);
        keyboardRow.add(keyboardButton2);
        keyboardRow.add(keyboardButton3);
        keyboardRow.add(keyboardButton4);
        keyboardRow.add(keyboardButton5);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public static ReplyKeyboardMarkup sendBuyurtmaTarixi(Long chatId) {
        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("Contact jonatish");
        keyboardButton1.setRequestContact(true);

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton1);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public static ReplyKeyboardMarkup sendDeliverButton(Long chatId) {

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83C\uDFC3 Olib ketish");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("\uD83D\uDE99 Yetkazib berish");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("⬅\uFE0F Ortga");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton1);
        keyboardRow.add(keyboardButton2);
        keyboardRow.add(keyboardButton3);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public static ReplyKeyboardMarkup sendPIYDEL(Long chatId) {

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("\uD83D\uDCCD Eng yaqin filialni aniqlash");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("Filialni tanlang");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("Bu yerda buyurtma berish \uD83C\uDF10");


        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton1);
        keyboardRow.add(keyboardButton2);
        keyboardRow.add(keyboardButton3);
        keyboardRow.add(keyboardButton4);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;

    }

    public InlineKeyboardMarkup sendJamoa(Long chatId) {
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("O'tish");
        button1.setCallbackData("ot");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(button1);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow1);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(rowList);

        return inlineKeyboardMarkup;
    }

    public ReplyKeyboard sendAloqaButton(Long chatId) {
        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCAC Biz bilan aloqaga chiqing");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("✍\uFE0F Fikr bildirish");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton1);
        keyboardRow.add(keyboardButton2);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboard sendYetkazibBerish(Long chatId) {
        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCCD Eng yaqin filialni aniqlash");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("\uD83D\uDDFA Mening manzillarim");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("⬅\uFE0F Ortga");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton1);
        keyboardRow.add(keyboardButton2);
        keyboardRow.add(keyboardButton3);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboard sendsozlamaButton(Long chatId) {
        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("Ismni o'zgartirish");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("\uD83D\uDCF1 Raqamni o'zgartirish");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton2.setText("\uD83C\uDFD9 Shaharni o'zgartirish");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton2.setText("ℹ\uFE0F Filallar haqida ma'lumotlar");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton2.setText("\uD83D\uDCC4 Ommaviy taklif");

        KeyboardButton keyboardButton6 = new KeyboardButton();
        keyboardButton2.setText("⬅\uFE0F Ortga");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton1);
        keyboardRow.add(keyboardButton2);
        keyboardRow.add(keyboardButton3);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton4);
        keyboardRow2.add(keyboardButton5);
        keyboardRow2.add(keyboardButton6);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboard sendChoosFilial(Long chatId) {

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("Atlas Chimgan");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Nukus Asia.uz KSM");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("Oybek");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("Qo'yliq - 5");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("Markaz - 5");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton6 = new KeyboardButton();
        keyboardButton6.setText("Ko'kcha");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton7 = new KeyboardButton();
        keyboardButton7.setText("S.Rahimov");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton8 = new KeyboardButton();
        keyboardButton8.setText("Sergel 2");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton9 = new KeyboardButton();
        keyboardButton9.setText("Megaplanet KSM");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton10 = new KeyboardButton();
        keyboardButton10.setText("Buyuk ipak yo'li");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton11 = new KeyboardButton();
        keyboardButton11.setText("Parus KSM");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton12 = new KeyboardButton();
        keyboardButton12.setText("Zenit");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton13 = new KeyboardButton();
        keyboardButton13.setText("Farhod");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton14 = new KeyboardButton();
        keyboardButton14.setText("Eko Park");
//        keyboardButton1.setRequestLocation(true);

        KeyboardButton keyboardButton15 = new KeyboardButton();
        keyboardButton15.setText("⬅\uFE0F Ortga");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton1);
        keyboardRow.add(keyboardButton2);
        keyboardRow.add(keyboardButton3);
        keyboardRow.add(keyboardButton4);
        keyboardRow.add(keyboardButton5);
        keyboardRow.add(keyboardButton6);
        keyboardRow.add(keyboardButton7);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton8);
        keyboardRow2.add(keyboardButton9);
        keyboardRow2.add(keyboardButton10);
        keyboardRow2.add(keyboardButton11);
        keyboardRow2.add(keyboardButton12);
        keyboardRow2.add(keyboardButton13);
        keyboardRow2.add(keyboardButton14);

        KeyboardRow keyboardRow3 = new KeyboardRow();
        keyboardRow3.add(keyboardButton15);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);
        keyboardRows.add(keyboardRow3);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }
    public ReplyKeyboard Button(Long chatId) {

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCE5 Savat");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("\uD83C\uDF2F Pide va Lavash");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("\uD83C\uDF71 Setlar");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("\uD83C\uDF55 Pitsa");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("\uD83C\uDF55 50/50");

        KeyboardButton keyboardButton6 = new KeyboardButton();
        keyboardButton6.setText("\uD83C\uDF5F Sneklar");

        KeyboardButton keyboardButton7 = new KeyboardButton();
        keyboardButton7.setText("\uD83C\uDF45 Souslar");

        KeyboardButton keyboardButton8 = new KeyboardButton();
        keyboardButton8.setText("\uD83C\uDF70 Shirin pitsa");

        KeyboardButton keyboardButton9 = new KeyboardButton();
        keyboardButton9.setText("\uD83E\uDD57 Salatlar");

        KeyboardButton keyboardButton10 = new KeyboardButton();
        keyboardButton10.setText("\uD83E\uDD64 Ichimliklar");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        keyboardRow.add(keyboardButton1);
        keyboardRow.add(keyboardButton2);
        keyboardRow.add(keyboardButton3);
        keyboardRow.add(keyboardButton4);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton5);
        keyboardRow2.add(keyboardButton6);
        keyboardRow2.add(keyboardButton7);
        keyboardRow2.add(keyboardButton8);
        keyboardRow2.add(keyboardButton9);
        keyboardRow2.add(keyboardButton10);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }
}

