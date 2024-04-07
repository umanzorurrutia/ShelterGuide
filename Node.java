package src.backend;

class Node{
        public String street;
        Node[] listNeighbors;
        boolean isTarget;
        Node next;

        public Node(String inputStreet, Node[] inputlistNeighbors, boolean inputisTarget){
            this.street = inputStreet;
            this.listNeighbors = inputlistNeighbors;
            this.isTarget = inputisTarget;
        }

        public void setListNeighbors(Node[] listNeighbors) {
            this.listNeighbors = listNeighbors;
        }

        public void printNeighbors(){
            for (int i = 0; i < this.listNeighbors.length; i++){
                System.out.println(this.listNeighbors[i].street);
            }
        }

        public void setisTarget(boolean b){
            this.isTarget = b;
        }

}