/**
 * @authors  Katherine Bellman - 100325825
 * @file    OOP3200 - Fall 2021 - Java ICE 9
 * @date    November 15th, 2021
 */

package ca.durhamcollege;

import org.jetbrains.annotations.NotNull;

public class Vector2D {

    //==========PRIVATE INSTANCE VARIABLES==========
    private float x;
    private  float y;

    //==========PUBLIC PROPERTIES (MUTATORS & ACCESSORS)==========

                //=====Setters (Modifiers)=====
    public void setX(float x)
    {
        this.x = x;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    public void Set(float x, float y)
    {
        this.x =x;
        this.y = y;
    }

                //=====Getters (Accessors)=====
    public float getX()
    {
        return x;
    }
    public float getY()
    {
        return y;
    }

    //==========CONSTRUCTORS==========
    Vector2D()
    {
        this.x = 0;
        this.y = 0;
    }

    Vector2D(float x, float y)
    {
        Set(x,y);
    }

                //=====Copy constructor=====
    Vector2D(@NotNull Vector2D vector)
    {
        Set(vector.getX(), vector.getY());
    }

    //==========PRIVATE METHODS==========



    //==========PUBLIC METHODS==========

    public void add(Vector2D rhs)
    {
        this.setX(this.getX() + rhs.getX());
        this.setY(this.getY() + rhs.getY());
    }

    public void subtract (Vector2D rhs)
    {
        this.setX(this.getX() - rhs.getX());
        this.setY(this.getY() - rhs.getY());
    }

    public void multiply (Vector2D rhs)
    {
        this.setX(this.getX() * rhs.getX());
        this.setY(this.getY() * rhs.getY());
    }

    public void divide (Vector2D rhs)
    {
        this.setX(this.getX() / rhs.getX());
        this.setY(this.getY() / rhs.getY());
    }

    public boolean equals(Vector2D rhs)
    {
        return ((getX() == rhs.getX()) && (getY() == rhs.getY()));
    }

    public float getMagnitude()
    {
        return (float) Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY());
    }

    public void setScale(float scale)
    {
        this.set(this.getX() * scale, this.getY() * scale);
    }

    public void normaize()
    {
        var magnitude = this.getMagnitude();
        if ((double)(magnitude) > 9.9999974737875E-06)
        {
            Set(GetX() / magnitude, GetY()/ magnitude);
        }
        else
        {
            set(0.0f, 0.0f);
        }
    }

    public Vector2D getNormalized()
    {
        Vector2D vector = new Vector2D(getX(), getY());
        vector.Normalize();
        return vector;
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ')';
    }

    //==========STATIC METHODS==========


}
