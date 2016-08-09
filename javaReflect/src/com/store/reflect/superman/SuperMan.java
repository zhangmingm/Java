package com.store.reflect.superman;

public class SuperMan extends Person implements ActionInterface {

	private boolean blueBriefs;

    public void fly() {
        System.out.println("超人会飞耶～～");
    }

    public boolean isBlueBriefs() {
        return blueBriefs;
    }

    public void setBlueBriefs(boolean blueBriefs) {
        this.blueBriefs = blueBriefs;
    }

    @Override
    public void walk(int m) {
        System.out.println("超人会走耶～～走了" + m + "米就走不动了！");
    }
}
