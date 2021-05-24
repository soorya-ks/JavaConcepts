package com.matheesh.generics;

public class Container<E, T, H>  {

    E name;
    T age;
    H isVaccinated;

    public T getValue2() {
        return age;
    }

    public void setValue2(T age) {
        this.age = age;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public void setValue3(H isVaccinated){
        this.isVaccinated = isVaccinated;
    }

    public H getValue3(){
        return isVaccinated;
    }

    public void setAll(E name, T age, H status){
        this.name = name;
        this.age = age;
        this.isVaccinated = status;
    }

    @Override
    public String toString() {
        return "Container{" +
                "name=" + name +
                ", age=" + age +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
    //    public Container<E, T, H> addVaccineStatus(Container<E, T, H> container, HashMap<E, T> map, H isVaccinated){
//
//        for( Map.Entry<E, T> item : map.entrySet()){
//            container.setName(item.getKey());
//            container.setValue2(item.getValue());
//            container.setValue3(isVaccinated);
//        }
//        return container;
//    }

}
