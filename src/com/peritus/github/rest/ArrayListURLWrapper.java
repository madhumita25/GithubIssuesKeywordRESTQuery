package com.peritus.github.rest;

import java.net.URL;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * Wrapper class to hold URL list
 * @author bharde
 */
@XmlRootElement
public class ArrayListURLWrapper {
    public ArrayList<URL> Issue = new ArrayList<URL>();
}
