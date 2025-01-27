package ru.mirea.task6.computer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop implements Input
{
    private enum electronicsNames
    {
        Computer,
        Memory,
        Processor,
        Monitor
    }

    @Override
    public String GetComputerName()
    {
        return GetElectronic(Shop.electronicsNames.Computer);
    }

    @Override
    public String GetComputerProcessor()
    {
        return GetElectronic(Shop.electronicsNames.Processor);
    }

    @Override
    public String GetComputerMemory()
    {
        return GetElectronic(Shop.electronicsNames.Memory);
    }

    @Override
    public String GetComputerMonitor()
    {
        return GetElectronic(Shop.electronicsNames.Monitor);
    }

    private String GetElectronic(Shop.electronicsNames name)
    {
        System.out.print("Введите  название "+ name.toString() +": ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        return scanner.nextLine();
    }

    private List<String> arr = new ArrayList<>();

    public void addComp(String comp){arr.add(comp);}
    public void deleteComp(String comp){arr.remove(comp);}
    public String findComp(String comp){return arr.contains(comp) ? comp : "Ошибка, такого компьютера нет!";}
}