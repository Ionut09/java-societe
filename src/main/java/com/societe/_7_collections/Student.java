package com.societe._7_collections;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {

    //    @NonNull sau final intra la @RequiredArgsConstructor
    private long id;

    @EqualsAndHashCode.Include
    private String name;

    @EqualsAndHashCode.Include
    private int age;

//    public Student(long id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }

//    public boolean equals(Object other) {
//        if (other == null) return false;
//
//        if (other instanceof Student castedOther) {
//            if (this.getClass().getSimpleName().equals(other.getClass().getSimpleName())) {
//                return name != null
//                        && this.name.equals(castedOther.name)
//                        && this.age == castedOther.age;
//            }
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    //    public int hashCode() {
////        return this.name.hashCode() * age;
//        return Objects.hash(name, age);
//    }

}
