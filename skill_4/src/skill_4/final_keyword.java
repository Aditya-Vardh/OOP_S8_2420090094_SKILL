package skill_4;

    public class final_keyword{
        private final int myNumber;
        private final StringBuilder message = new StringBuilder("Hello");
        public final_keyword(int num) {
            this.myNumber = num; 
        }
        public final void displayNumber() {
            System.out.println("Final variable myNumber = " + myNumber);
        }
        public void modifyMessage() {
            message.append(", World!");
            System.out.println("Modified message: " + message);   
        }
        public static void main(String[] args) {
            final_keyword obj = new final_keyword(42);
            obj.displayNumber();
            obj.modifyMessage();
        }
  }