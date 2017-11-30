package com.itcast.yitao.design.model.prototypeModel;

import java.io.*;

/**
 * Created by 311198 on 2017/2/8.
 * 原型模式 分为浅复制 、深复制两种方式
 * 浅复制：复制对象后 ，新对象中的引用类型地址还是指向原来对象的
 * 深复制：复制对象后，新对象中的基本类型 或者引用类型都是重新创建的，而不是指向原来对象的
 */
public class Prototype implements Cloneable, Serializable {

        private static final long serialVersionUID = 1L;
        private String string;

        private SerializableObject obj;

        /* 浅复制 */
        public Object clone() throws CloneNotSupportedException {
            Prototype proto = (Prototype) super.clone();
            return proto;
        }

        /* 深复制 */
        public Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        public SerializableObject getObj() {
            return obj;
        }

        public void setObj(SerializableObject obj) {
            this.obj = obj;
        }

    }

    class SerializableObject implements Serializable {
        private static final long serialVersionUID = 1L;
    }
