package controller;

import java.util.ArrayList;
import view.CadastroGUI;
import view.FindUserGUI;
import model.Pessoa;

public class Controller {
    private final CadastroGUI cadastroGui;
    private final FindUserGUI findGui = new FindUserGUI(this);
    private final ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Controller(CadastroGUI cadastroGui) {
        this.cadastroGui = cadastroGui;
    }
    
    public void addPessoa(){
        String nome = cadastroGui.getInputName().getText();
        String sobrenome = cadastroGui.getInputLastName().getText();
        String cpf = cadastroGui.getInputCpf().getText();
        String sexo = cadastroGui.getButtonGroup().getSelection().getActionCommand();
        int idade = Integer.parseInt(cadastroGui.getInputIdade().getText());
        
        Pessoa p = new Pessoa(nome, sobrenome, cpf, sexo, idade);
        pessoas.add(p);
        findGui.setVisible(true);
        
        cadastroGui.getInputName().setText("");
        cadastroGui.getInputLastName().setText("");
        cadastroGui.getInputCpf().setText("");
        cadastroGui.getInputIdade().setText("");
        cadastroGui.getButtonGroup().clearSelection();
    }
    
    public void  findPessoa(){
        String cpf = findGui.getInputFind().getText();
        findGui.getInputFind().setText("");
        System.out.println(cpf);
        boolean isHere = false;
        for(Pessoa p : pessoas){
            if(cpf.equals(p.getCpf())){
               System.out.println(p.getCpf());
                System.out.println(p.toString());
               findGui.getTxtArea().setText(p.toString());
               isHere = true;
            }
        }
        if(!isHere){
           findGui.getTxtArea().setText("CPF não encontrado!!!");
        }
    }
    
    
}
