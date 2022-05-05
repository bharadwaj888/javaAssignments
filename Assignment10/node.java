package Assignment10;

class node<type> {
    type data;
    node<type> pointtoNext;
    node(type data){
        this.data =data;
        this.pointtoNext = null;
    }
}
