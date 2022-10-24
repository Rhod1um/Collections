import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DeckList<E> implements List<E> {
  //hvis man ikke implementerer <E> så fjerner man <> når man implementere DeckList<> deck = new...
  //Så <E> skal være med for at man kan bruge datatyper når man instantierer det.
  //Her kan man altså også bestemme, hvilke datatyper der må accepteres.
  //dvs man kan lave en liste der kun kan optage cards.

  //<> er generisk datatype og man bruger defautl annotering E. <E>
  //Man kan lave en klasse som implementere List interfacet og så kan man bruge den
  //på linje med arraylist og linkedlist.
  //de er på lige fod. Arraylist og linkedlist er bare som dette, nogle har lavet sin egen klasse
  //hvor den laver arrays og implementere List
  //linked list er bare klasse med List som bruger referencer til at flytte på ting hvis man sletter et index
  //linkedlist gemmer ting i objekter som er linked til hinanden mens arraylist bruger arrays
  //laver man sin egen liste (klasse der implementere List) så får man adgang til alle metodee i List
  //arraylist og linkedlist virker forskelligt og bruges til forskellige ting men de har adgang til de
  //samme metoder.
  //samme gælder ens custom made list.

  //List er bare et interface så man skal selv implementere alle metoderne

  Object[] arr = new Object[100];
  private int size = 0;


  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator<E> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

  //man kan custom made de indbyggede metoder
  //skal gøres for det er "neutrale" fra start
  @Override
  public boolean add(E e) {
    this.arr[size] = e;
    return true;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public E get(int index) {
    return null;
  }

  @Override
  public E set(int index, E element) {
    return null;
  }

  @Override
  public void add(int index, E element) {

  }

  @Override
  public E remove(int index) {
    return null;
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<E> listIterator() {
    return null;
  }

  @Override
  public ListIterator<E> listIterator(int index) {
    return null;
  }

  @Override
  public List<E> subList(int fromIndex, int toIndex) {
    return null;
  }
}
