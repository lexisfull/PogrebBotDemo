package ru.panov.bot.pogrebbotdemo.service;


import org.telegram.telegrambots.meta.api.objects.Update;

import java.text.DecimalFormat;

public class CalculationBodyMassIndex {

    String str = message.getText();
    String[] data = str.trim().split(" ");
    double bimass = ((double) Integer.parseInt(data[0]) / (Integer.parseInt(data[1]) * Integer.parseInt(data[1])) * 10000);
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    String result = decimalFormat.format(bimass);
    String res = "ИМТ = " + result;
    sendMessage(message.getChatId(), res);
}
