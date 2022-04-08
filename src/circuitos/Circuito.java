/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuitos;

/**
 *
 * @author JJ
 */
public class Circuito
{
    /**
     * @return the _capacidad
     */
    public int getCapacidad()
    {
        return _capacidad;
    }

    /**
     * @param _capacidad the _capacidad to set
     */
    public void setCapacidad(int _capacidad)
    {
        this._capacidad = _capacidad;
    }
    public int _capacidad = 0;

    public Circuito(int capacidad)
    {
        this._capacidad = capacidad;
    }
}
