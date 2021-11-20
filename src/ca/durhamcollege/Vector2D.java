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
    public void setX(final float x)
    {
        this.x = x;
    }

    public void setY(final float y)
    {
        this.y = y;
    }

    public void set(final float x,final float y)
    {
        this.x =x;
        this.y = y;
    }
    public void set(final Vector2D vector)
    {
        this.x = vector.x;
        this.y = vector.y;
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

    Vector2D(final float x,final float y)
    {
        set(x,y);
    }

                //=====Copy constructor=====
    Vector2D(final Vector2D vector)
    {
        set(vector.getX(), vector.getY());
    }

    //==========PRIVATE METHODS==========


    //==========PUBLIC METHODS==========

    public void add(final Vector2D rhs)
    {
        this.setX(this.getX() + rhs.getX());
        this.setY(this.getY() + rhs.getY());
    }

    public void subtract (final Vector2D rhs)
    {
        this.setX(this.getX() - rhs.getX());
        this.setY(this.getY() - rhs.getY());
    }

    public void multiply (final Vector2D rhs)
    {
        this.setX(this.getX() * rhs.getX());
        this.setY(this.getY() * rhs.getY());
    }

    public void divide (final Vector2D rhs)
    {
        this.setX(this.getX() / rhs.getX());
        this.setY(this.getY() / rhs.getY());
    }

    public boolean equals(final Vector2D rhs)
    {
        return ((getX() == rhs.getX()) && (getY() == rhs.getY()));
    }

    public float getMagnitude()
    {
        return (float) Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY());
    }


    public float getSqrMagnitude()
    {
        return (this.getX() * this.getX() + this.getY() * this.getY());
    }

    public void setScale(final float scale)
    {
        this.set(this.getX() * scale, this.getY() * scale);
    }

    public void setScale(final Vector2D scale)
    {
        this.set(this.getX() * scale.x, this.getY() * scale.y);
    }

    public void normalize()
    {
        var magnitude = this.getMagnitude();
        if ((double)(magnitude) > 9.99999974737875E-06)
        {
            set(getX() / magnitude, getY()/ magnitude);
        }
        else
        {
            set(Vector2D.zero());
        }
    }

    public Vector2D getNormalized()
    {
        Vector2D vector = new Vector2D(getX(), getY());
        vector.normalize();
        return vector;
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ')';
    }

    //==========STATIC METHODS==========

    public static Vector2D zero()
    {
        return new Vector2D(0.0f, 0.0f);
    }

    public static Vector2D one()
    {
        return new Vector2D(1.0f, 1.0f);
    }

    public static Vector2D left()
    {
        return new Vector2D(-1.0f, 0.0f);
    }

    public static Vector2D right()
    {
        return new Vector2D(1.0f, 0.0f);
    }

    public static Vector2D up()
    {
        return new Vector2D(0.0f, 1.0f);
    }

    public static Vector2D down()
    {
        return new Vector2D(0.0f, -1.0f);
    }

    public static Vector2D lerp(final Vector2D a, final Vector2D b, float t)
    {
        if ((double)(t) < 0.0)
        {
            t = 0.0f;
        }
        if ((double)(t) > 1.0)
        {
            t = 1.0f;
        }

        return new Vector2D(a.getX() + (b.getX() - a.getX()) * t, a.getY() + (b.getY() - a.getY()) * t);
    }

    public static  float dot(final Vector2D lhs, final Vector2D rhs)
    {
        return (float)((double)(lhs.getX()) * (double)(rhs.getX()) + (double)(lhs.getY()) * (double)(rhs.getY()));
    }

    public static float distance(final Vector2D a, final Vector2D b)
    {
        final  var delta_x = (double)(b.getX()) - (double)(a.getX());
        final  var delta_y = (double)(b.getY()) - (double)(a.getY());

        return (float)(Math.sqrt(delta_x * delta_x + delta_y * delta_y));
    }

}
