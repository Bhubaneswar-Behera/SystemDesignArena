package com.lld.solid.principle.liskov.substitution.bad;

public class Ostrich extends Bird{
    void fly() { throw new UnsupportedOperationException(); }
}
