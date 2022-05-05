package Assignment10;

class Slist<type>
{
    node<type> head;
    node<type> SlistIterator;

    Slist()
    {
        this.head = null;
    }

    public void addintoSList(type data)
    {
        node<type> temp = new node<>(data);
        SlistIterator = head;
        if (SlistIterator == null)
        {
            head = temp;
        }
        else
        {
            while (SlistIterator.pointtoNext!= null)
            {
                SlistIterator = SlistIterator.pointtoNext;
            }
            SlistIterator.pointtoNext = temp;
        }
    }

    public void removefromList(type data) {
        SlistIterator = head;
        node<type> prev = new node<>(null);
        prev.pointtoNext = SlistIterator;
        boolean ifPresent = false;
        if (head.data == data) {
            head = head.pointtoNext;
            ifPresent = true;

        }
        while (SlistIterator.pointtoNext != null) {
            if (data.toString().equals(SlistIterator.toString())) {
                prev = SlistIterator.pointtoNext;
                ifPresent = true;
                break;
            }
            prev = SlistIterator;
            SlistIterator = SlistIterator.pointtoNext;

        }
        if (ifPresent == false) {
            if ((SlistIterator.data).toString().equals((data).toString())) {
                prev.pointtoNext = null;
                ifPresent = true;
            }
        }
    }


    public void print() {

        SlistIterator = head;
        if(SlistIterator == null)
            System.out.println("Nothing to print!!!");
        while (SlistIterator!=null)
        {
            System.out.print(SlistIterator.data + " ");
            SlistIterator=SlistIterator.pointtoNext;
        }
    }
}
