public class Displei {
        private int diagnol  ;
        private  int proizvoditel ;
        private  int tipMatrincy ;

        public Displei(int diagnol, int proizvoditel, int tipMatrincy) {
            this.diagnol = diagnol;
            this.proizvoditel = proizvoditel;
            this.tipMatrincy = tipMatrincy;
        }

        public int getDiagnol() {
            return diagnol;
        }

        public void setDiagnol(int diagnol) {
            this.diagnol = diagnol;
        }

        public int getProizvoditel() {
            return proizvoditel;
        }

        public void setProizvoditel(int proizvoditel) {
            this.proizvoditel = proizvoditel;
        }

        public int getTipMartincy() {
            return tipMatrincy;
        }

        public void setTipMartincy(int tipMartincy) {
            this.tipMatrincy = tipMartincy;
        }

        @Override
        public String toString() {
            return "Displei{" +
                    "diagnol=" + diagnol +
                    ", proizvoditel=" + proizvoditel +
                    ", tipMartincy=" + tipMatrincy +
                    '}';
        }

}
