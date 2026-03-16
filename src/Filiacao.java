public class Filiacao {

        private String nomeDaMae;
        private String nomeDoPai;
        
        public Filiacao(String nomeDaMae, String nomeDoPai) {
            this.nomeDaMae = nomeDaMae;
            this.nomeDoPai = nomeDoPai;
        }

        public String getNomeDaMae() {
            return nomeDaMae;
        }

        public void setNomeDaMae(String nomeDaMae) {
            this.nomeDaMae = nomeDaMae;
        }

        public String getNomeDoPai() {
            return nomeDoPai;
        }

        public void setNomeDoPai(String nomeDoPai) {
            this.nomeDoPai = nomeDoPai;
        }   

        public String toString() {
            return "\nFiliacao nomeDaMae=" + nomeDaMae +
                   "\n nomeDoPai=" + nomeDoPai ;
        }


}