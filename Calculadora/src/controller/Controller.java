package controller;

import view.Janela;
import model.OperacaoMath;
import model.Somar;
import model.Subtrair;
import model.Multi;
import model.Div;

public class Controller {
    private Janela calculadoraGUI;
    private OperacaoMath calc;
    private String n1, n2;

    public Controller(Janela calculadoraGUI) {
        this.calculadoraGUI = calculadoraGUI;
    }
        
    public void controleZero(){
        String text = calculadoraGUI.getTxtDisplay().getText();
        calculadoraGUI.getTxtDisplay().setText(text + "0");
    }
    public void controleUm(){
        String text = calculadoraGUI.getTxtDisplay().getText();
        calculadoraGUI.getTxtDisplay().setText(text + "1");
    }
    public void controleDois(){
        String text = calculadoraGUI.getTxtDisplay().getText();
        calculadoraGUI.getTxtDisplay().setText(text + "2");
    }
    public void controleTres(){
        String text = calculadoraGUI.getTxtDisplay().getText();
        calculadoraGUI.getTxtDisplay().setText(text + "3");
    }
    public void controleQuatro(){
        String text = calculadoraGUI.getTxtDisplay().getText();
        calculadoraGUI.getTxtDisplay().setText(text + "4");
    }
    public void controleCinco(){
        String text = calculadoraGUI.getTxtDisplay().getText();
        calculadoraGUI.getTxtDisplay().setText(text + "5");
    }
    public void controleSeis(){
        String text = calculadoraGUI.getTxtDisplay().getText();
        calculadoraGUI.getTxtDisplay().setText(text + "6");
    }
    public void controleSete(){
        String text = calculadoraGUI.getTxtDisplay().getText();
        calculadoraGUI.getTxtDisplay().setText(text + "7");
    }
    public void controleOito(){
        String text = calculadoraGUI.getTxtDisplay().getText();
        calculadoraGUI.getTxtDisplay().setText(text + "8");
    }
    public void controleNove(){
        String text = calculadoraGUI.getTxtDisplay().getText();
        calculadoraGUI.getTxtDisplay().setText(text + "9");
    }
    
    public void controleSoma(){
        n1 = calculadoraGUI.getTxtDisplay().getText();
        calc = new Somar();
        calculadoraGUI.getTxtDisplay().setText("");
    }
    
    public void controleSubtrair(){
        n1 = calculadoraGUI.getTxtDisplay().getText();
        calc = new Subtrair();
        calculadoraGUI.getTxtDisplay().setText("");
    }
    
    public void controleMulti(){
        n1 = calculadoraGUI.getTxtDisplay().getText();
        calc = new Multi();
        calculadoraGUI.getTxtDisplay().setText("");
    }
    
    public void controleDiv(){
        n1 = calculadoraGUI.getTxtDisplay().getText();
        calc = new Div();
        calculadoraGUI.getTxtDisplay().setText("");
    }
    
    public void controleClear(){
        calculadoraGUI.getTxtDisplay().setText("");
    }
    
    public void controleRes(){
        n2 =  calculadoraGUI.getTxtDisplay().getText();
        double r = calc.calcular(Double.parseDouble(n1), Double.parseDouble(n2));
        calculadoraGUI.getTxtDisplay().setText(String.valueOf(r));
    }
}
