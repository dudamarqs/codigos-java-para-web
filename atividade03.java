public class atividade03 {
    public static void main(String[] args) {
        int hora, minuto, segundo;
        int passaram, faltam;

        hora = 12;
        minuto = 25;
        segundo = 0;

        passaram = segundo + minuto*60 + hora*3600;
        faltam = 86400 - passaram;

        System.out.println("Hora: " + hora + ":" + minuto + ":" + segundo);
        System.out.println("Já se passaram " + passaram + " 'segundos desde o início do dia.");
        System.out.println("Faltam " + faltam + " segundos para o dia terminar.");
    }
}
