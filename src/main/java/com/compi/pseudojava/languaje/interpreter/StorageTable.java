package com.compi.pseudojava.languaje.interpreter;

/*
Funciones:
    hello(5, 3) -> llamada. actual params
    int hello(int x, int y) -> cuerpo. formal params

Al declarar:
    FunctionAttr -> funcdeclast
    Guardar las instancias de los formal params con valores por defecto (Map)

Al llamar:
    Trae el funcAttr
    Almacenar los valores en Map haciendo asoc entre actual-paras y formal-params
    Llamar al visit del block de function decl
    Al entrar al visit de block verificar si el parent es una function-decl, obtener los datos del
    map y guardarlos en el storage ya que es hasta en el block que se abre un nuevo scope
 */
public class StorageTable<T extends Instance> {

}
