package com.mycompany.lab04exe04;

import java.util.ArrayList;
/**
 *
 * @author art5m
 */
public class Carro { 
    private ArrayList<Roda> rodas = new ArrayList<>();
    private ArrayList<Banco> bancos = new ArrayList<>();
    private ArrayList<Porta> portas = new ArrayList<>();
    private ArrayList<Farol> farois = new ArrayList<>();
    private Motor motor;
    private Transmissao transmissao;
    private SistemaDeFreio freio;
    private PainelDeControle dashboard; 
    private TanqueDeCombustivel tanque;
    private Carroceria carroceria;

    public void setRodas(Roda roda) {
        for (int i = 0; i < 4; i++) {
            this.rodas.add(roda);
        }
    }

    public void setBancos(Banco banco) {
        for (int i = 0; i < 5; i++) {
            this.bancos.add(banco);
        }
    }

    public void setPortas(Porta porta) {
        for (int i = 0; i < 5; i++) {    
            this.portas.add(porta);
        }
    }

    public void setFarois(Farol farol) {
        for (int i = 0; i < 5; i++) {
            this.farois.add(farol);
        }
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    public void setFreio(SistemaDeFreio freio) {
        this.freio = freio;
    }

    public void setDashboard(PainelDeControle dashboard) {
        this.dashboard = dashboard;
    }

    public void setTanque(TanqueDeCombustivel tanque) {
        this.tanque = tanque;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public String toString() {
        return "Carro:" + "Rodas: [" + rodas + "], Bancos: [" + bancos + "], Portas: [" + portas + "], Farois: [" + farois + "], Motor:" + motor + ", transmissao:" + transmissao + ", freio:" + freio + ", dashboard:" + dashboard + ", tanque:" + tanque + ", carroceria:" + carroceria + '.';
    }
    
    public void newSportCar(String cor) {
        rodas = new ArrayList<>();
        bancos = new ArrayList<>();
        portas = new ArrayList<>();
        farois = new ArrayList<>();
        setRodas(new Roda("Pirelli", 20));
        setBancos(new Banco("Couro", cor));
        setPortas(new Porta(cor, true));
        setFarois(new Farol("Tipo A", 50));
            
        setCarroceria(new Carroceria(cor, "Esportivo"));
        setTanque(new TanqueDeCombustivel("Gasolina", 65.00));
        setDashboard(new PainelDeControle(cor, true));
            
        setMotor(new Motor("V8", 660));
        setTransmissao(new Transmissao("Automatico", 8));
        setFreio(new SistemaDeFreio("Freios a disco", true));
    }
        
    public void newSUVCar(String cor) {
        rodas = new ArrayList<>();
        bancos = new ArrayList<>();
        portas = new ArrayList<>();
        farois = new ArrayList<>();
        setRodas(new Roda("Michelin", 18)); 
        setBancos(new Banco("Estofado", cor));
        setPortas(new Porta(cor, true));
        setFarois(new Farol("Tipo B", 50)); 
            
        setCarroceria(new Carroceria(cor, "SUV")); 
        setTanque(new TanqueDeCombustivel("Gasolina", 70.00)); 
        setDashboard(new PainelDeControle(cor, true));
           
        setMotor(new Motor("V6", 400)); 
        setTransmissao(new Transmissao("Automatico", 8));
        setFreio(new SistemaDeFreio("Freios a disco", true));
    }

    public void newPicapeCar(String cor) {
        rodas = new ArrayList<>();
        bancos = new ArrayList<>();
        portas = new ArrayList<>();
        farois = new ArrayList<>();
        setRodas(new Roda("Bridgestone", 20));
        setBancos(new Banco("Estofado", cor));
        setPortas(new Porta(cor, true));
        setFarois(new Farol("Tipo C", 50)); 
           
        setCarroceria(new Carroceria(cor, "Picape")); 
        setTanque(new TanqueDeCombustivel("Gasolina", 80.00)); 
        setDashboard(new PainelDeControle(cor, true));
           
        setMotor(new Motor("V8", 500)); 
        setTransmissao(new Transmissao("Automatico", 8)); 
        setFreio(new SistemaDeFreio("Freios a disco", true));
    }
    
    
    public class Roda {
        private String marca;
        private int aro;

        public Roda(String marca, int tamanho) {
            this.marca = marca;
            this.aro = tamanho;
        }
        
        public String getMarca() {
            return marca;
        }

        public int getTamanho() {
            return aro;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setTamanho(int tamanho) {
            this.aro = tamanho;
        }

        @Override
        public String toString() {
            return "[ marca:" + marca + ", aro:" + aro + ']';
        }
        
    }
    
    public class Motor {
        private String tipo;
        private int potencia;

        public Motor(String tipo, int potencia) {
            this.tipo = tipo;
            this.potencia = potencia;
        }

        public String getTipo() {
            return tipo;
        }

        public int getPotencia() {
            return potencia;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setPotencia(int potencia) {
            this.potencia = potencia;
        }

        @Override
        public String toString() {
            return "Motor: [" + " tipo: " + tipo + ", potencia:" + potencia + "cv" + ']';
        }     
    }
    
    public class Transmissao {
        private String tipo;
        private int marchas;

        public Transmissao(String tipo, int marchas) {
            this.tipo = tipo;
            this.marchas = marchas;
        }

        public String getTipo() {
            return tipo;
        }

        public int getMarchas() {
            return marchas;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setMarchas(int marchas) {
            this.marchas = marchas;
        }

        @Override
        public String toString() {
            return "Transmissao: [" + "tipo:" + tipo + ", marchas:" + marchas + ']';
        }
    }
    
    public class TanqueDeCombustivel {
        private String tipoDeCombustivel;
        private double capacidade;

        public TanqueDeCombustivel(String tipoDeCombustivel, double capacidade) {
            this.tipoDeCombustivel = tipoDeCombustivel;
            this.capacidade = capacidade;
        }

        public String getTipoDeCombustivel() {
            return tipoDeCombustivel;
        }

        public double getCapacidade() {
            return capacidade;
        }

        public void setTipoDeCombustivel(String tipoDeCombustivel) {
            this.tipoDeCombustivel = tipoDeCombustivel;
        }

        public void setCapacidade(double capacidade) {
            this.capacidade = capacidade;
        }  

        @Override
        public String toString() {
            return "TanqueDeCombustivel: [ " + "tipo de Combustivel: " + tipoDeCombustivel + ", capacidade:" + capacidade + ']';
        }
    }
    
    public class Banco {
        private String material, cor;

        public Banco(String material, String cor) {
            this.material = material;
            this.cor = cor;
        }

        public String getMaterial() {
            return material;
        }

        public String getCor() {
            return cor;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }  

        @Override
        public String toString() {
            return "[" + "material: " + material + ", cor: " + cor + ']';
        }    
    }
    
    public class Carroceria {
        private String cor, tipo;

        public Carroceria(String cor, String tipo) {
            this.cor = cor;
            this.tipo = tipo;
        }

        public String getCor() {
            return cor;
        }

        public String getTipo() {
            return tipo;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return " [ " + "cor: " + cor + ", tipo: " + tipo + ']';
        }
    }
    
    public class SistemaDeFreio {
        private String tipo;
        private boolean hasAbs;

        public SistemaDeFreio(String tipo, boolean hasAbs) {
            this.tipo = tipo;
            this.hasAbs = hasAbs;
        }
        
        public String getTipo() {
            return tipo;
        }

        public boolean isHasAbs() {
            return hasAbs;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setHasAbs(boolean hasAbs) {
            this.hasAbs = hasAbs;
        }

        @Override
        public String toString() {
            return "SistemaDeFreio: [" + "tipo:" + tipo + ", hasAbs:" + hasAbs + ']';
        }
     }
    
    public class Porta {
        private String cor;
        private boolean hasWindow;

        public Porta(String cor, boolean hasWindow) {
            this.cor = cor;
            this.hasWindow = hasWindow;
        }

        public String getCor() {
            return cor;
        }

        public boolean isHasWindow() {
            return hasWindow;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setHasWindow(boolean hasWindow) {
            this.hasWindow = hasWindow;
        }

        @Override
        public String toString() {
            return "[" + "cor: " + cor + ", hasWindow:" + hasWindow + ']';
        } 
    }
    
    public class PainelDeControle {
        private String cor;
        private boolean hasGps;

        public PainelDeControle(String cor, boolean hasGps) {
            this.cor = cor;
            this.hasGps = hasGps;
        }

        public String getCor() {
            return cor;
        }

        public boolean isHasGps() {
            return hasGps;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setHasGps(boolean hasGps) {
            this.hasGps = hasGps;
        }

        @Override
        public String toString() {
            return "PainelDeControle: [" + "cor: " + cor + ", hasGps: " + hasGps + ']';
        }
    } 
    
    public class Farol {
        private String tipo;
        private int brilho;

        public Farol() {
        }

        public Farol(String tipo, int brilho) {
            this.tipo = tipo;
            this.brilho = brilho;
        }

        public String getTipo() {
            return tipo;
        }

        public int getBrilho() {
            return brilho;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setBrilho(int brilho) {
            this.brilho = brilho;
        }

        @Override
        public String toString() {
            return "[" + "tipo:" + tipo + ", brilho:" + brilho + ']';
        }
        
    }
}


