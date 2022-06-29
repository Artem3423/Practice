package sample;

//импорт библиотек
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.text.DecimalFormat;

//класс контроллер, который управляет окном приложения
public class Controller {

    @FXML   //Переменные метода хорд
    private Button bError;
    public TextField tf1;
    public TextField tf2;
    public TextField tf3;
    public TextField tf4;
    public TextField tf5;
    public TextField tf6;
    public TextField tf7;
    public TextField tf8;
    public TextField tf9;
    public TextField tfaccuracy;
    public TextField tfx1;
    public TextField tfx2;
    public Label labelError;
    public Label ansver;

    @FXML   //Переменные метода косательных
    private Button bError2;
    public TextField tf12;
    public TextField tf22;
    public TextField tf32;
    public TextField tf42;
    public TextField tf52;
    public TextField tf62;
    public TextField tf72;
    public TextField tf82;
    public TextField tf92;
    public TextField tfaccuracy2;
    public TextField tfx12;
    public TextField tfx22;
    public Label labelError2;
    public Label ansver2;

    //Вспомогательные переменные для вычислений
    public String x0;
    public double x01;
    public String x1;
    public double x11;
    public String e;
    public Double e1;
    public boolean checkError = true;
    public String ansverVr;
    public int index;
    public int ansLen;
    public Double ch1;
    public Double ch2;

    public Double tfin1;
    public String tfin2;
    public Double tfin3;
    public String tfin4;
    public Double tfin5;
    public String tfin6;
    public Double tfin7;
    public String tfin8;
    public Double tfin9;

    public String tfst1;
    public String tfst2;
    public String tfst3;
    public String tfst4;
    public String tfst5;
    public String tfst6;
    public String tfst7;
    public String tfst8;
    public String tfst9;



    // Метод для кнопок и считывания полей с данными
    public void initialize(){
        bError.setOnAction(event -> {
            labelError.setText("");
            checkError = true;
            e = tfaccuracy.getText();
            try {
                e1 = new Double(e);
                System.out.println(e1);
            }catch (NumberFormatException e1) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            //проверка корректности введёной точности
            switch(e) {
                case "1":
                    break;
                case "0.1":
                    break;
                case "0.01":
                    break;
                case "0.001":
                    break;
                case "0.0001":
                    break;
                default:
                    checkError = false;
                    labelError.setText("Неверные данные");
            }

            x0 = tfx1.getText();
            try {
                x01 = new Double(x0);
                System.out.println(x01);
            }catch (NumberFormatException x01) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            x1 = tfx2.getText();
            try {
                x11 = new Double(x1);
                System.out.println(x11);
            }catch (NumberFormatException x11) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            tfst1 = tf1.getText();
            try {
                tfin1 = new Double(tfst1);
                System.out.println(tfin1);
            }catch (NumberFormatException tfin1) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            tfst2 = tf2.getText();
            try {
                tfin2 = new String(tfst2);
                System.out.println(tfin2);
            }catch (NumberFormatException tfin2) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            tfst3 = tf3.getText();
            try {
                tfin3 = new Double(tfst3);
                System.out.println(tfin3);
            }catch (NumberFormatException tfin3) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            tfst4 = tf4.getText();
            try {
                tfin4 = new String(tfst4);
                System.out.println(tfin4);
            }catch (NumberFormatException tfin4) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            tfst5 = tf5.getText();
            try {
                tfin5 = new Double(tfst5);
                System.out.println(tfst5);
            }catch (NumberFormatException tfst5) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            tfst6 = tf6.getText();
            try {
                tfin6 = new String(tfst6);
                System.out.println(tfst6);
            }catch (NumberFormatException tfst6) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            tfst7 = tf7.getText();
            try {
                tfin7 = new Double(tfst7);
                System.out.println(tfst7);
            }catch (NumberFormatException tfst7) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            tfst8 = tf8.getText();
            try {
                tfin8 = new String(tfst8);
                System.out.println(tfst8);
            }catch (NumberFormatException tfst8) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            tfst9 = tf9.getText();
            try {
                tfin9 = new Double(tfst9);
                System.out.println(tfst9);
            }catch (NumberFormatException tfst9) {
                checkError = false;
                labelError.setText("Неверные данные");
            }

            switch(tfin4) {
                case "-":
                    break;
                case "+":
                    break;
                default:
                    checkError = false;
                    labelError.setText("Неверные данные");
            }

            switch(tfin8) {
                case "-":
                    break;
                case "+":
                    break;
                default:
                    checkError = false;
                    labelError.setText("Неверные данные");
            }

            if (checkError) {
                solve();
            }
        });

        bError2.setOnAction(event -> {
            labelError2.setText("");
            checkError = true;
            e = tfaccuracy2.getText();
            try {
                e1 = new Double(e);
                System.out.println(e1);
            }catch (NumberFormatException e1) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            //проверка корректности введёной точности
            switch(e) {
                case "1":
                    break;
                case "0.1":
                    break;
                case "0.01":
                    break;
                case "0.001":
                    break;
                case "0.0001":
                    break;
                default:
                    checkError = false;
                    labelError2.setText("Неверные данные");
            }

            x0 = tfx12.getText();
            try {
                x01 = new Double(x0);
                System.out.println(x01);
            }catch (NumberFormatException x01) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            x1 = tfx22.getText();
            try {
                x11 = new Double(x1);
                System.out.println(x11);
            }catch (NumberFormatException x11) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            tfst1 = tf12.getText();
            try {
                tfin1 = new Double(tfst1);
                System.out.println(tfin1);
            }catch (NumberFormatException tfin1) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            tfst2 = tf22.getText();
            try {
                tfin2 = new String(tfst2);
                System.out.println(tfin2);
            }catch (NumberFormatException tfin2) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            tfst3 = tf32.getText();
            try {
                tfin3 = new Double(tfst3);
                System.out.println(tfin3);
            }catch (NumberFormatException tfin3) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            tfst4 = tf42.getText();
            try {
                tfin4 = new String(tfst4);
                System.out.println(tfin4);
            }catch (NumberFormatException tfin4) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            tfst5 = tf52.getText();
            try {
                tfin5 = new Double(tfst5);
                System.out.println(tfst5);
            }catch (NumberFormatException tfst5) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            tfst6 = tf62.getText();
            try {
                tfin6 = new String(tfst6);
                System.out.println(tfst6);
            }catch (NumberFormatException tfst6) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            tfst7 = tf72.getText();
            try {
                tfin7 = new Double(tfst7);
                System.out.println(tfst7);
            }catch (NumberFormatException tfst7) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            tfst8 = tf82.getText();
            try {
                tfin8 = new String(tfst8);
                System.out.println(tfst8);
            }catch (NumberFormatException tfst8) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            tfst9 = tf92.getText();
            try {
                tfin9 = new Double(tfst9);
                System.out.println(tfst9);
            }catch (NumberFormatException tfst9) {
                checkError = false;
                labelError2.setText("Неверные данные");
            }

            switch(tfin4) {
                case "-":
                    break;
                case "+":
                    break;
                default:
                    checkError = false;
                    labelError2.setText("Неверные данные");
            }

            switch(tfin8) {
                case "-":
                    break;
                case "+":
                    break;
                default:
                    checkError = false;
                    labelError2.setText("Неверные данные");
            }

            if (checkError) {
                solve2();
            }
        });

    }

    @FXML   //метод начала решения методом хорд
    public void solve() {
        double x = method_chord(x01, x11, e1);
        ansverVr = String.valueOf(x);

        switch(e) {
            case "1":
                ansverVr = round(ansverVr, 0);
                break;
            case "0.1":
                ansverVr = round(ansverVr, 1);
                break;
            case "0.01":
                ansverVr = round(ansverVr, 2);
                break;
            case "0.001":
                ansverVr = round(ansverVr, 3);
                break;
            case "0.0001":
                ansverVr = round(ansverVr, 4);
                break;
            default:
                checkError = false;
                labelError.setText("Неверные данные");
        }

        ansver.setText(ansverVr);
        System.out.println(ansverVr);
    }

    @FXML   //метод начала решения методом косательных
    public void solve2() {
        double x = kosat(x01, e1);
        ansverVr = String.valueOf(x);

        switch(e) {
            case "1":
                ansverVr = round(ansverVr, 0);
                break;
            case "0.1":
                ansverVr = round(ansverVr, 1);
                break;
            case "0.01":
                ansverVr = round(ansverVr, 2);
                break;
            case "0.001":
                ansverVr = round(ansverVr, 3);
                break;
            case "0.0001":
                ansverVr = round(ansverVr, 4);
                break;
            default:
                checkError = false;
                labelError.setText("Неверные данные");
        }

        ansver2.setText(ansverVr);
        System.out.println(ansverVr);
    }
    //вычисление методом хорд (ищем x)
    public double method_chord(double x_prev, double x_curr, double e) {
        double x_next = 0;
        double tmp;
        do{
            tmp = x_next;
            x_next = x_curr - f(x_curr) * (x_prev - x_curr) / (f(x_prev) - f(x_curr));
            x_prev = x_curr;
            x_curr = tmp;
        } while (Math.abs(x_next - x_curr) > e);
        return x_next;
    }

    //решение уравнения, метод хорд
    public double f (double x){
        ch1 = x;

        if (tfin3 != null){
            ch1 = Math.pow(x, tfin3);
        }

        if (tfin1 != null){
            ch1 = tfin1 * ch1;
        }

        ch2 = Math.pow(x, tfin7);
        ch2 = tfin5 * ch2;

        switch(tfin4) {
            case "-":
                ch1 = ch1 - ch2;
                break;
            case "+":
                ch1 = ch1 + ch2;
                break;
        }

        switch(tfin8) {
            case "-":
                ch1 = ch1 - tfin9;
                break;
            case "+":
                ch1 = ch1 + tfin9;
                break;
        }

        return ch1;
    }

    //решение уравнения, метод косательных
    public double f2(double x) {
        ch1 = x;

        if (tfin3 != null){
            ch1 = Math.pow(x, tfin3);
        }

        if (tfin1 != null){
            ch1 = tfin1 * ch1;
        }

        ch2 = Math.pow(x, tfin7);
        ch2 = tfin5 * ch2;

        switch(tfin4) {
            case "-":
                ch1 = ch1 - ch2;
                break;
            case "+":
                ch1 = ch1 + ch2;
                break;
        }

        switch(tfin8) {
            case "-":
                ch1 = ch1 - tfin9;
                break;
            case "+":
                ch1 = ch1 + tfin9;
                break;
        }

        return ch1;
    }

    //производная исходного уравнения для решения методом косательных
    public double prf(double x) {
        ch1 = x;

        if (tfin3 != null){
            ch1 = Math.pow(x, tfin3 - 1);
        }

        if (tfin1 != null){
            ch1 = (tfin1 * tfin3) * ch1;
        } else {
            ch1 = ch1 * tfin3;
        }

        if (tfin7 != null){
            ch2 = Math.pow(x, tfin7 - 1);
        }

        if (tfin5 != null){
            ch2 = (tfin5 * tfin7) * ch2;
        } else {
            ch2 = ch2 * tfin7;
        }

        switch(tfin4) {
            case "-":
                ch1 = ch1 - ch2;
                break;
            case "+":
                ch1 = ch1 + ch2;
                break;
        }

        return ch1;
    }

    //вычисление методом косательных (ищем x)
    public double kosat(double a, double e) {
        double x = a;
        double razn;
        do {
            double xn = x - f2(x) / prf(x);
            razn = Math.abs(xn - x);
            x = xn;
        } while (razn > e);

        return x - f2(x) / prf(x);
    }

    //метод для округления ответа
    public String round(String st, double nol) {
        Double ch = null;
        String sample;

        switch((int) nol) {
            case 0:
                sample = "#";
                break;
            case 1:
                sample = "#.#";
                break;
            case 2:
                sample = "#.##";
                break;
            case 3:
                sample = "#.###";
                break;
            case 4:
                sample = "#.####";
                break;
            default:
                sample = "#";
        }

        try {
            ch = new Double(st);
            ansLen = ansverVr.length();

        }catch (NumberFormatException tfst7) {
            System.err.println("Неправильный формат строки!round");
        }
        
        DecimalFormat decimalFormat = new DecimalFormat( sample );
        String result = decimalFormat.format(ch);

        result = result.replace(",", ".");
        return result;
    }
}
