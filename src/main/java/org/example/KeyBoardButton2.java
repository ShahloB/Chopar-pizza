package org.example;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class KeyBoardButton2 {
    public ReplyKeyboard ButtonPideVaLavash(Long chatId) {

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCE5 Savat");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("VEGETARIAN LAVASH");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("TOVUQ STEYK LAVASH");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("PISHLOQLI PIDE");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("GO’SHTLI PIDE");

        KeyboardButton keyboardButton6 = new KeyboardButton();
        keyboardButton6.setText("3+1 VEGETARIAN LAVASH");

        KeyboardButton keyboardButton7 = new KeyboardButton();
        keyboardButton7.setText("3+1 TOVUQ STEYK LAVASH");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        keyboardRow.add(keyboardButton1);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton2);
        keyboardRow2.add(keyboardButton3);

        KeyboardRow keyboardRow3 = new KeyboardRow();
        keyboardRow3.add(keyboardButton4);
        keyboardRow3.add(keyboardButton5);

        KeyboardRow keyboardRow4 = new KeyboardRow();
        keyboardRow4.add(keyboardButton6);
        keyboardRow4.add(keyboardButton7);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);
        keyboardRows.add(keyboardRow3);
        keyboardRows.add(keyboardRow4);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboard ButtonSet(Long chatId) {

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCE5 Savat");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("1+1 Pepperoni 30");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("SNEK SET");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("YANGI MUMTOZ SET");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("GO’SHTLI SET");

        KeyboardButton keyboardButton6 = new KeyboardButton();
        keyboardButton6.setText("MAZALI SET");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        keyboardRow.add(keyboardButton1);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton2);
        keyboardRow2.add(keyboardButton3);

        KeyboardRow keyboardRow3 = new KeyboardRow();
        keyboardRow3.add(keyboardButton4);
        keyboardRow3.add(keyboardButton5);

        KeyboardRow keyboardRow4 = new KeyboardRow();
        keyboardRow4.add(keyboardButton6);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);
        keyboardRows.add(keyboardRow3);
        keyboardRows.add(keyboardRow4);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboard ButtonPizza(Long chatId) {

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCE5 Savat");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Vegetarian");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("Meksika");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("Bayram");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("Go'shtli");

        KeyboardButton keyboardButton6 = new KeyboardButton();
        keyboardButton6.setText("Ikki karra pepperoni");

        KeyboardButton keyboardButton7 = new KeyboardButton();
        keyboardButton7.setText("Xon pitsa");

        KeyboardButton keyboardButton8 = new KeyboardButton();
        keyboardButton8.setText("Quvvat");

        KeyboardButton keyboardButton9 = new KeyboardButton();
        keyboardButton9.setText("Barbekyu");

        KeyboardButton keyboardButton10 = new KeyboardButton();
        keyboardButton10.setText("Rostbif");

        KeyboardButton keyboardButton11 = new KeyboardButton();
        keyboardButton11.setText("Julyen");

        KeyboardButton keyboardButton12 = new KeyboardButton();
        keyboardButton12.setText("Tovuqli");

        KeyboardButton keyboardButton13 = new KeyboardButton();
        keyboardButton13.setText("Ovchi");

        KeyboardButton keyboardButton14 = new KeyboardButton();
        keyboardButton14.setText("Kombo");

        KeyboardButton keyboardButton15 = new KeyboardButton();
        keyboardButton15.setText("Pepperoni");

        KeyboardButton keyboardButton16 = new KeyboardButton();
        keyboardButton16.setText("Margarita");

        KeyboardButton keyboardButton17 = new KeyboardButton();
        keyboardButton17.setText("Pishloqli");

        KeyboardButton keyboardButton18 = new KeyboardButton();
        keyboardButton18.setText("1+1 Pepperoni 30");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        keyboardRow.add(keyboardButton1);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton2);
        keyboardRow2.add(keyboardButton3);

        KeyboardRow keyboardRow3 = new KeyboardRow();
        keyboardRow3.add(keyboardButton4);
        keyboardRow3.add(keyboardButton5);

        KeyboardRow keyboardRow4 = new KeyboardRow();
        keyboardRow4.add(keyboardButton6);
        keyboardRow4.add(keyboardButton7);

        KeyboardRow keyboardRow5 = new KeyboardRow();
        keyboardRow5.add(keyboardButton8);
        keyboardRow5.add(keyboardButton9);

        KeyboardRow keyboardRow6 = new KeyboardRow();
        keyboardRow6.add(keyboardButton10);
        keyboardRow6.add(keyboardButton11);

        KeyboardRow keyboardRow7 = new KeyboardRow();
        keyboardRow7.add(keyboardButton12);
        keyboardRow7.add(keyboardButton13);

        KeyboardRow keyboardRow8 = new KeyboardRow();
        keyboardRow8.add(keyboardButton14);
        keyboardRow8.add(keyboardButton15);

        KeyboardRow keyboardRow9 = new KeyboardRow();
        keyboardRow9.add(keyboardButton16);
        keyboardRow9.add(keyboardButton17);

        KeyboardRow keyboardRow10 = new KeyboardRow();
        keyboardRow10.add(keyboardButton18);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);
        keyboardRows.add(keyboardRow3);
        keyboardRows.add(keyboardRow4);
        keyboardRows.add(keyboardRow5);
        keyboardRows.add(keyboardRow6);
        keyboardRows.add(keyboardRow7);
        keyboardRows.add(keyboardRow8);
        keyboardRows.add(keyboardRow9);
        keyboardRows.add(keyboardRow10);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboard Button50(Long chatId) {

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCE5 Savat");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Vegetarian");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("Meksika");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("Bayram");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("Go'shtli");

        KeyboardButton keyboardButton6 = new KeyboardButton();
        keyboardButton6.setText("Ikki karra pepperoni");

        KeyboardButton keyboardButton7 = new KeyboardButton();
        keyboardButton7.setText("Xon pitsa");

        KeyboardButton keyboardButton8 = new KeyboardButton();
        keyboardButton8.setText("Quvvat");

        KeyboardButton keyboardButton9 = new KeyboardButton();
        keyboardButton9.setText("Barbekyu");

        KeyboardButton keyboardButton10 = new KeyboardButton();
        keyboardButton10.setText("Rostbif");

        KeyboardButton keyboardButton11 = new KeyboardButton();
        keyboardButton11.setText("Julyen");

        KeyboardButton keyboardButton12 = new KeyboardButton();
        keyboardButton12.setText("Tovuqli");

        KeyboardButton keyboardButton13 = new KeyboardButton();
        keyboardButton13.setText("Ovchi");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        keyboardRow.add(keyboardButton1);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton2);
        keyboardRow2.add(keyboardButton3);

        KeyboardRow keyboardRow3 = new KeyboardRow();
        keyboardRow3.add(keyboardButton4);
        keyboardRow3.add(keyboardButton5);

        KeyboardRow keyboardRow4 = new KeyboardRow();
        keyboardRow4.add(keyboardButton6);
        keyboardRow4.add(keyboardButton7);

        KeyboardRow keyboardRow5 = new KeyboardRow();
        keyboardRow5.add(keyboardButton8);
        keyboardRow5.add(keyboardButton9);

        KeyboardRow keyboardRow6 = new KeyboardRow();
        keyboardRow6.add(keyboardButton10);
        keyboardRow6.add(keyboardButton11);

        KeyboardRow keyboardRow7 = new KeyboardRow();
        keyboardRow7.add(keyboardButton12);
        keyboardRow7.add(keyboardButton13);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);
        keyboardRows.add(keyboardRow3);
        keyboardRows.add(keyboardRow4);
        keyboardRows.add(keyboardRow5);
        keyboardRows.add(keyboardRow6);
        keyboardRows.add(keyboardRow7);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboard ButtonSnack(Long chatId) {

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCE5 Savat");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("FRI KARTOSHKASI");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("JAYDARI KARTOSHKA");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("TOVUQ NAGETS, 6 dona");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("PISHLOQLI TOVUQ QALAMCHALARI");

        KeyboardButton keyboardButton6 = new KeyboardButton();
        keyboardButton6.setText("TOVUQ NAGETS, 9 dona");

        KeyboardButton keyboardButton7 = new KeyboardButton();
        keyboardButton7.setText("CHOPAR SOUSIDAGI QANOTCHALAR");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        keyboardRow.add(keyboardButton1);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton2);
        keyboardRow2.add(keyboardButton3);

        KeyboardRow keyboardRow3 = new KeyboardRow();
        keyboardRow3.add(keyboardButton4);
        keyboardRow3.add(keyboardButton5);

        KeyboardRow keyboardRow4 = new KeyboardRow();
        keyboardRow4.add(keyboardButton6);
        keyboardRow4.add(keyboardButton7);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);
        keyboardRows.add(keyboardRow3);
        keyboardRows.add(keyboardRow4);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboard ButtonSous(Long chatId) {

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCE5 Savat");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("KETCHUP SOUS");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("CHILI SOUS");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("FRENCH SOUS");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("SEZAR SOUS");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        keyboardRow.add(keyboardButton1);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton2);
        keyboardRow2.add(keyboardButton3);

        KeyboardRow keyboardRow3 = new KeyboardRow();
        keyboardRow3.add(keyboardButton4);
        keyboardRow3.add(keyboardButton5);

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

    public ReplyKeyboard ButtonSweetPizza(Long chatId) {

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCE5 Savat");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("SHOKOLADLI 30 SM");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("SHOKOLADLI 25 SM");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        keyboardRow.add(keyboardButton1);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton2);
        keyboardRow2.add(keyboardButton3);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public ReplyKeyboard ButtonDrink(Long chatId) {

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCE5 Savat");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("MONTELLA SUVI");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("\"СОЧНАЯ ДОЛИНА\" OLCHA");

        KeyboardButton keyboardButton4 = new KeyboardButton();
        keyboardButton4.setText("\"СОЧНАЯ ДОЛИНА\" MULTIFRUT SHARBATI");

        KeyboardButton keyboardButton5 = new KeyboardButton();
        keyboardButton5.setText("\"СОЧНАЯ ДОЛИНА\" OLMA SHARBATI");

        KeyboardButton keyboardButton6 = new KeyboardButton();
        keyboardButton6.setText("\"СОЧНАЯ ДОЛИНА\" SHAFTOLI SHARBATI");

        KeyboardButton keyboardButton7 = new KeyboardButton();
        keyboardButton7.setText("COCA-COLA 0.25С");

        KeyboardButton keyboardButton8 = new KeyboardButton();
        keyboardButton8.setText("FANTA 0.25С");

        KeyboardButton keyboardButton9 = new KeyboardButton();
        keyboardButton9.setText("FUSE TEA SHAFTOLI");

        KeyboardButton keyboardButton10 = new KeyboardButton();
        keyboardButton10.setText("FUSE TEA MANGO VA ANANAS");

        KeyboardButton keyboardButton11 = new KeyboardButton();
        keyboardButton11.setText("COCA-COLA 0.25B");

        KeyboardButton keyboardButton12 = new KeyboardButton();
        keyboardButton12.setText("COCA-COLA 0.25В ZERO SUGAR");

        KeyboardButton keyboardButton13 = new KeyboardButton();
        keyboardButton13.setText("FANTA 0.25В");

        KeyboardButton keyboardButton14 = new KeyboardButton();
        keyboardButton14.setText("COCA-COLA 0.5");

        KeyboardButton keyboardButton15 = new KeyboardButton();
        keyboardButton15.setText("FANTA 0.5");

        KeyboardButton keyboardButton16 = new KeyboardButton();
        keyboardButton16.setText("SPRITE 0.5");

        KeyboardButton keyboardButton17 = new KeyboardButton();
        keyboardButton17.setText("COCA-COLA 1.0");

        KeyboardButton keyboardButton18 = new KeyboardButton();
        keyboardButton18.setText("FANTA 1.0");

        KeyboardButton keyboardButton19 = new KeyboardButton();
        keyboardButton19.setText("SPRITE 1.0");

        KeyboardButton keyboardButton20 = new KeyboardButton();
        keyboardButton20.setText("\"СОЧНАЯ ДОЛИНА\" OLMA SHARBATI");

        KeyboardButton keyboardButton21 = new KeyboardButton();
        keyboardButton21.setText("\"СОЧНАЯ ДОЛИНА\" MULTIFRUT SHARBATI");

        KeyboardButton keyboardButton22 = new KeyboardButton();
        keyboardButton22.setText("\"СОЧНАЯ ДОЛИНА\" LIMON VA YALPIZ SHARBATI");

        KeyboardButton keyboardButton23 = new KeyboardButton();
        keyboardButton23.setText("\"СОЧНАЯ ДОЛИНА\" OLCHA SHARBATI");

        KeyboardButton keyboardButton24 = new KeyboardButton();
        keyboardButton24.setText("\"СОЧНАЯ ДОЛИНА\" O‘RIK SHARBATI");

        KeyboardButton keyboardButton25 = new KeyboardButton();
        keyboardButton25.setText("COCA-COLA 1.5");

        KeyboardButton keyboardButton26 = new KeyboardButton();
        keyboardButton26.setText("FANTA 1.5");

        KeyboardButton keyboardButton27 = new KeyboardButton();
        keyboardButton27.setText("SPRITE 1.5");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        keyboardRow.add(keyboardButton1);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton2);
        keyboardRow2.add(keyboardButton3);

        KeyboardRow keyboardRow3 = new KeyboardRow();
        keyboardRow3.add(keyboardButton4);
        keyboardRow3.add(keyboardButton5);

        KeyboardRow keyboardRow4 = new KeyboardRow();
        keyboardRow4.add(keyboardButton6);
        keyboardRow4.add(keyboardButton7);

        KeyboardRow keyboardRow5 = new KeyboardRow();
        keyboardRow5.add(keyboardButton8);
        keyboardRow5.add(keyboardButton9);

        KeyboardRow keyboardRow6 = new KeyboardRow();
        keyboardRow6.add(keyboardButton10);
        keyboardRow6.add(keyboardButton11);

        KeyboardRow keyboardRow7 = new KeyboardRow();
        keyboardRow7.add(keyboardButton12);
        keyboardRow7.add(keyboardButton13);

        KeyboardRow keyboardRow8 = new KeyboardRow();
        keyboardRow8.add(keyboardButton14);
        keyboardRow8.add(keyboardButton15);

        KeyboardRow keyboardRow9 = new KeyboardRow();
        keyboardRow9.add(keyboardButton16);
        keyboardRow9.add(keyboardButton17);

        KeyboardRow keyboardRow10 = new KeyboardRow();
        keyboardRow10.add(keyboardButton18);
        keyboardRow10.add(keyboardButton19);

        KeyboardRow keyboardRow11 = new KeyboardRow();
        keyboardRow11.add(keyboardButton20);
        keyboardRow11.add(keyboardButton21);

        KeyboardRow keyboardRow12 = new KeyboardRow();
        keyboardRow12.add(keyboardButton22);
        keyboardRow12.add(keyboardButton23);

        KeyboardRow keyboardRow13 = new KeyboardRow();
        keyboardRow13.add(keyboardButton24);
        keyboardRow13.add(keyboardButton25);

        KeyboardRow keyboardRow14 = new KeyboardRow();
        keyboardRow14.add(keyboardButton26);
        keyboardRow14.add(keyboardButton27);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);
        keyboardRows.add(keyboardRow3);
        keyboardRows.add(keyboardRow4);
        keyboardRows.add(keyboardRow5);
        keyboardRows.add(keyboardRow6);
        keyboardRows.add(keyboardRow7);
        keyboardRows.add(keyboardRow8);
        keyboardRows.add(keyboardRow9);
        keyboardRows.add(keyboardRow10);
        keyboardRows.add(keyboardRow11);
        keyboardRows.add(keyboardRow12);
        keyboardRows.add(keyboardRow13);
        keyboardRows.add(keyboardRow14);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }
    public ReplyKeyboard ButtonSalad(Long chatId) {

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("⬅\uFE0F Ortga");

        KeyboardButton keyboardButton1 = new KeyboardButton();
        keyboardButton1.setText("\uD83D\uDCE5 Savat");

        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("GREKCHA SALAT");

        KeyboardButton keyboardButton3 = new KeyboardButton();
        keyboardButton3.setText("SEZAR SALATI");

        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);
        keyboardRow.add(keyboardButton1);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(keyboardButton2);
        keyboardRow2.add(keyboardButton3);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardRow2);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public InlineKeyboardMarkup sendInline(Long chatId) {

        InlineKeyboardButton btn1 = InlineKeyboardButton.builder()
                .text("➖")
                .callbackData("➖")
                .build();

        InlineKeyboardButton btn2 = InlineKeyboardButton.builder()
                .text("1 \uD83D\uDE23")
                .callbackData("1 \uD83D\uDE23")
                .build();

        InlineKeyboardButton btn3 = InlineKeyboardButton.builder()
                .text("➕")
                .callbackData("➕")
                .build();

        InlineKeyboardButton btn4 = InlineKeyboardButton.builder()
                .text("Savatga qo'shish")
                .callbackData("savatga qo'shish")
                .build();


        List<InlineKeyboardButton> row1 = new ArrayList<>();
        row1.add(btn1);
        row1.add(btn2);
        row1.add(btn3);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        row2.add(btn4);


        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        rows.add(row1);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(rows);

        return markup;
    }
}
