public class Main {
    public static void main(String[] args) {
        Klaviatura klaviatura=new Klaviatura("kuyot","jok");
        USB usb=new USB(3,873596565);
        Operativ operativ=new Operativ(240,23);
        SSD ssd = new SSD(354,1);
        Displei displei = new Displei(15,34,6);
        Computer computer = new Computer(displei,ssd,operativ,usb,klaviatura,"Asus","Black");
        System.out.println(computer);
    }
}

