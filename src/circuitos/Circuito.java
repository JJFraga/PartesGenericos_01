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
    public int _capacidad = 0;
    public Boolean _cebar = true;

    public Circuito(int capacidad)
    {
        this._capacidad = capacidad;
    }

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
}
