public class SingleLinkedList {
    SingleLinkedListElement first = null;
    int lenght = 0;
    /**
     * Вставить в конец.
     * @param value значение.
     */
    public void add(int value) {
        SingleLinkedListElement lastElement = getElement(lenght);

        SingleLinkedListElement newElement = new SingleLinkedListElement();
        newElement.value = value;
        if (lastElement == null) {
            first = newElement;
        } else {
            lastElement.next = newElement;
        }
        lenght++;
    }

    /**
     * Удалить из конца.
     */
    public void removeLast() {
    }

    public void remove(int index) {
        if(index == 0){
            first = getElement(index+1);
        }
        else if(index == lenght){
            SingleLinkedListElement a = getElement(lenght-1);
            a.next = null;
        }
        else {
            SingleLinkedListElement a = getElement(index - 1);
            SingleLinkedListElement b = getElement(index + 1);
            a.next = b.next;
        }
        lenght--;
    }

    /**
     * @param pos номер элемента (начиная с нуля)
     * @return значение по этому индексу
     */
    public int get(int pos) {
        SingleLinkedListElement a = getElement(pos);
        return a.value;
    }

    /**
     * @return текущий размер
     */
    public int size() {
        return lenght;
    }
    private SingleLinkedListElement getElement(int pos){
        SingleLinkedListElement a = first;
        for(int i=0;i<pos-1;i++){
            a = a.next;
        }
        return a;
    }
}
