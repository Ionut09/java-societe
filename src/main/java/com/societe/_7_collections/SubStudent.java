package com.societe._7_collections;

public class SubStudent extends Student {

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;

        if (other instanceof SubStudent castedOther) {
            return this.getName().equals(castedOther.getName())
                    && this.getName() == castedOther.getName();
        }
        return false;
    }
}
