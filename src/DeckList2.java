import java.util.*;

public class DeckList2<E> implements List<E> {

  Object[] arr = new Object[52]; //alle pladser er null fra start
  private int size = 0; //ændres i add-metoden. size++

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

  @Override
  public boolean contains(Object o) {
    for (Object object : arr) {
      if (object == o) {
        return true;
      }
    }
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

  @Override
  public boolean add(E e) {
    this.arr[size] = e; //adder e på første ufyldte plads i arrayet
    this.size++;
    return true; //skal tjekke om alt går godt og returnere hvis det gør. Skal laves ekstra
  }

  @Override
  public boolean remove(Object o) {
    boolean isFound = false;

    if (this.size > 0) {
      for (int i = 0; i < arr.length; i++) {
        if (i < arr.length - 1) {
          if (arr[i] == o) {
            isFound = true;
            this.size--;
          }
          if (isFound) {
            arr[i] = arr[i + 1];
          }
        } else {
          if (arr[i] == o) {
            isFound = true;
            this.size--;
            arr[i] = null;
          }
          if (isFound) {
            arr[i] = null;
          }
        }
      }
    }
    return isFound;
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
    Arrays.fill(arr, null);
    this.size = 0;
  }

  @Override
  public E get(int index) {
    if (index < size && index >= 0) {
      return (E) arr[index];
    }
    return null;
  }

  @Override
  public E set(int index, E element) {
    if (index >= 0 && index < arr.length) {
      Object object = (E) arr[index];
      for (int i = 0; i < arr.length; i++) {
        if (i == index) {
          arr[index] = element;
        }
      }
      return (E) object;
    }
    return null;
  }

  @Override
  public void add(int index, E element) {
    boolean indexFound = false;
    int sizeNow = this.size;

    if (index >= 0 && index < sizeNow) {
      for (int i = 0; i < size; i++) {
        if (i == index) {
          indexFound = true;
        }
        if (indexFound && index < sizeNow - 1) {
          arr[i+1] = arr[i];
        }
      }
    }
    arr[index] = element;
    this.size++;
    ///
    //lavet af claus: adder bare på første ledige plads
    if (arr[index] != null){
      for (int i=index; i<arr.length; i++){
        if (arr[i] == null){
          arr[i] = arr[index];
          i=arr.length; //stopper loopet når indexet er ændret så den ikke ændre resten
          //til af indexerne til det man vil sætte ind
        }
      }
    }

  }
    //else throw new ArrayIndexOutOfBoundsException();
    //der skal ikke være try catch for det er en runtime exception
    //plus laves en try-catch her vil ingen se den. Den ville skulle kastes når add() bruges


  @Override
  public E remove(int index) {
    boolean isFound = false;
    Object object = null;

      if (this.size > 0) {
        for (int i = 0; i < arr.length; i++) {
          if (i < arr.length - 1) {
            if (i == index) {
              isFound = true;
              this.size--;
              object = arr[i];
            }
            if (isFound) {
              arr[i] = arr[i + 1];
            }
          } else {
            if (i == index) {
              isFound = true;
              this.size--;
              arr[i] = null;
              object = arr[i];
            }
            if (isFound) {
              arr[i] = null;
            }
          }
        }
      }
      return (E)object;
    }

  @Override
  public int indexOf(Object o) {
    if (o != null){
      for(int i=0; i<this.size; i++){
        if (arr[i].equals(o)){
          return i;
        }
      }
    }
    return -1;
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
