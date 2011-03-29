package org.moogirc.jbomberman.resources;


import java.io.*;


/**
 * All classes that will load a resource (animation, image, sound, etc) will have to implement this interface
 *
 * @author Mathias Bjerke <mathias@verida.no>
 */
public interface ResourceLoader<T> {
	public T load( File filename );
}
