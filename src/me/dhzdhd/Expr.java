package me.dhzdhd;

abstract class Expr {

    record BinaryTest (Expr left, Token operator, Expr right){}
    record UnaryTest (Token operator, Expr expr){}
    static class Binary extends Expr {
        Binary(Expr left, Token operator, Expr right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }

        final Expr left;
        final Token operator;
        final Expr right;
    }
}
