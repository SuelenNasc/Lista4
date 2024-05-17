package br.edu.up.modelos;

public class Ponto {

        private double x;
        private double y;
    
        public Ponto() {
            this.x = 0.0;
            this.y = 0.0;
        }
    
        public Ponto(double x, double y) {
            this.x = x;
            this.y = y;
        }
    
        public void setX(double x) {
            this.x = x;
        }
    
        public double getX() {
            return x;
        }
    
        public void setY(double y) {
            this.y = y;
        }
    
        public double getY() {
            return y;
        }
    
        public double calcularDistancia(double x, double y) {
            double deltaX = x - this.x;
            double deltaY = y - this.y;
            return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        }
    
        public double calcularDistancia(Ponto p) {
            return calcularDistancia(p.getX(), p.getY());
        }
    }
    
