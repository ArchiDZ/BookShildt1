package Glava5;

public class EncDec {
    /*
        Использование побитовой операции исключаещего ИЛИ
        Для шифрования и дешифрования сообщений
    */
    public static void Encode(){
        String msg = "Это просто текст";
        String enmsg = "";
        String demsg = "";
        int key = 88;

        System.out.print("Исходное сообщение-->" +msg);

        // Шифрование сообщения
        for(int i =0;i<msg.length();i++)
            enmsg = enmsg+(char)(msg.charAt(i)^key);

        System.out.print("Зашифрованое сообщение-->"+enmsg);

        //Дешифровка сообщения
        for(int i=0;i<msg.length();i++)
            demsg = demsg+(char)(enmsg.charAt(i)^key);

        System.out.println("Дешифрованое сообщение-->"+demsg);
    }
}
