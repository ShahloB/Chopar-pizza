package org.example;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineButton {

    private static InlineKeyboardMarkup sendInline(Long chatId) {

        InlineKeyboardButton btn1 = InlineKeyboardButton.builder()
                .text("Mahsulot")
                .callbackData("mahsulot")
                .build();

        InlineKeyboardButton btn2 = InlineKeyboardButton.builder()
                .text("1 \uD83D\uDE23")
                .callbackData("1 \uD83D\uDE23")
                .build();

        InlineKeyboardButton btn3 = InlineKeyboardButton.builder()
                .text("2 ☹\uFE0F")
                .callbackData("2 ☹\uFE0F")
                .build();

        InlineKeyboardButton btn4 = InlineKeyboardButton.builder()
                .text("3 \uD83D\uDE15")
                .callbackData("3 \uD83D\uDE15")
                .build();

        InlineKeyboardButton btn5 = InlineKeyboardButton.builder()
                .text("4 \uD83D\uDE11")
                .callbackData("4 \uD83D\uDE11")
                .build();

        InlineKeyboardButton btn6 = InlineKeyboardButton.builder()
                .text("5 \uD83D\uDE0D")
                .callbackData("5 \uD83D\uDE0D")
                .build();

        InlineKeyboardButton btn7 = InlineKeyboardButton.builder()
                .text("Xizmat")
                .callbackData("xizmat")
                .build();

        InlineKeyboardButton btn8 = InlineKeyboardButton.builder()
                .text("1 \uD83D\uDC4A")
                .callbackData("1 \uD83D\uDC4A")
                .build();

        InlineKeyboardButton btn9 = InlineKeyboardButton.builder()
                .text("2 \uD83D\uDC4E")
                .callbackData("2 \uD83D\uDC4E")
                .build();

        InlineKeyboardButton btn10 = InlineKeyboardButton.builder()
                .text("3 \uD83D\uDC4C")
                .callbackData("3 \uD83D\uDC4C")
                .build();

        InlineKeyboardButton btn11 = InlineKeyboardButton.builder()
                .text("4 \uD83E\uDD19")
                .callbackData("4 \uD83E\uDD19")
                .build();

        InlineKeyboardButton btn12 = InlineKeyboardButton.builder()
                .text("5 \uD83D\uDC4D")
                .callbackData("5 \uD83D\uDC4D")
                .build();

        InlineKeyboardButton btn13 = InlineKeyboardButton.builder()
                .text("Yetkazib berish")
                .callbackData("yetkazib berish")
                .build();

        InlineKeyboardButton btn14 = InlineKeyboardButton.builder()
                .text("1 \uD83D\uDC0C")
                .callbackData("1 \uD83D\uDC0C")
                .build();

        InlineKeyboardButton btn15 = InlineKeyboardButton.builder()
                .text("2 \uD83D\uDC22")
                .callbackData("2 \uD83D\uDC22")
                .build();

        InlineKeyboardButton btn16 = InlineKeyboardButton.builder()
                .text("3 \uD83D\uDEFA")
                .callbackData("3 \uD83D\uDEFA")
                .build();

        InlineKeyboardButton btn17 = InlineKeyboardButton.builder()
                .text("4 \uD83C\uDFCE")
                .callbackData("4 \uD83C\uDFCE")
                .build();

        InlineKeyboardButton btn18 = InlineKeyboardButton.builder()
                .text("5 \uD83D\uDE80")
                .callbackData("5 \uD83D\uDE80")
                .build();

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        row1.add(btn1);

        List<InlineKeyboardButton> row2 = new ArrayList<>();
        row2.add(btn2);
        row2.add(btn3);
        row2.add(btn4);
        row2.add(btn5);
        row2.add(btn6);

        List<InlineKeyboardButton> row3 = new ArrayList<>();
        row3.add(btn7);


        List<InlineKeyboardButton> row4 = new ArrayList<>();
        row4.add(btn8);
        row4.add(btn9);
        row4.add(btn10);
        row4.add(btn11);
        row4.add(btn12);

        List<InlineKeyboardButton> row5 = new ArrayList<>();
        row5.add(btn13);

        List<InlineKeyboardButton> row6 = new ArrayList<>();
        row6.add(btn14);
        row6.add(btn15);
        row6.add(btn16);
        row6.add(btn17);
        row6.add(btn18);

        List<List<InlineKeyboardButton>> rows = new ArrayList<>();
        rows.add(row1);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(rows);

//        SendMessage msg = SendMessage.builder()
//                .chatId(chatId)
//                .text("Chopar Pizzaning Kontrol servisi.")
//                .replyMarkup(markup)
//                .build();

        return markup;
    }
}
