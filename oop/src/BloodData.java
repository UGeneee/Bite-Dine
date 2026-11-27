
public class BloodData {

        private String bloodType;
        private String rhFactor;

        public BloodData() {
            bloodType = "O";
            rhFactor = "+";
        }

        public String getBloodType() {
            return bloodType;
        }

        public void setBloodType(String bloodType) {
            if (bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") || bloodType.equals("O")) {
                this.bloodType = bloodType;
            }
        }

        public String getRhFactor() {
            return rhFactor;
        }

        public void setRhFactor(String rhFactor) {
            if (rhFactor.equals("+") || rhFactor.equals("-")) {
                this.rhFactor = rhFactor;
        }
    }
}
