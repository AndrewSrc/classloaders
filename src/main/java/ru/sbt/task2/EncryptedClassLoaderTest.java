package ru.sbt.task2;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class EncryptedClassLoaderTest {

    @Test
    void testEncryptClass() throws IOException, ClassNotFoundException {
        //target\classes\ru\sbt\task2
        File file = new File( "target\\classes\\ru\\sbt\\task2\\EncryptedClassLoader.class" );
        Files.write( Paths.get( "target\\classes\\ru\\sbt\\task1\\PluginImageXor.class" ), EncryptedClassLoader.xorKey( file, ( byte ) 125 ) );
        File fileXorKey = new File( "target\\classes\\ru\\sbt\\task1\\PluginImageXor.class" );
        EncryptedClassLoader encryptedClassLoader = new EncryptedClassLoader( ( byte ) 125, file, ClassLoader.getSystemClassLoader() );
        Class clazz =  encryptedClassLoader.findClass( "EncryptedClassLoader" );
        Method[] methods=clazz.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }
    }


}