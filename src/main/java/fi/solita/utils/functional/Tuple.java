package fi.solita.utils.functional;

import static fi.solita.utils.functional.Collections.emptyList;
import static fi.solita.utils.functional.Functional.map;
import static fi.solita.utils.functional.Functional.mkString;
import static fi.solita.utils.functional.Functional.zip;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public abstract class Tuple implements Serializable {
    
    public static <T> List<T> asList(Tuple0 tuple) {
        return emptyList();
    }
    
    @SuppressWarnings("unchecked")
    public static <T> List<T> asList(Tuple1<T> tuple) {
        return Arrays.asList(tuple._1);
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> asList(Tuple2<? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2);
    }
    
    @SuppressWarnings("unchecked")
    public static <T> List<T> asList(Tuple3<? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3);
    }
    
    @SuppressWarnings("unchecked")
    public static <T> List<T> asList(Tuple4<? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4);
    }
    
    @SuppressWarnings("unchecked")
    public static <T> List<T> asList(Tuple5<? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5);
    }
    
    @SuppressWarnings("unchecked")
    public static <T> List<T> asList(Tuple6<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple7<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple8<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple9<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple10<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple11<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple12<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple13<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12, tuple._13);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple14<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12, tuple._13, tuple._14);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple15<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12, tuple._13, tuple._14, tuple._15);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple16<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12, tuple._13, tuple._14, tuple._15, tuple._16);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple17<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12, tuple._13, tuple._14, tuple._15, tuple._16, tuple._17);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple18<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12, tuple._13, tuple._14, tuple._15, tuple._16, tuple._17, tuple._18);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple19<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12, tuple._13, tuple._14, tuple._15, tuple._16, tuple._17, tuple._18, tuple._19);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple20<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12, tuple._13, tuple._14, tuple._15, tuple._16, tuple._17, tuple._18, tuple._19, tuple._20);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple21<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12, tuple._13, tuple._14, tuple._15, tuple._16, tuple._17, tuple._18, tuple._19, tuple._20, tuple._21);
    }
    
    @SuppressWarnings({ "unchecked" })
    public static <T> List<T> asList(Tuple22<? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T, ? extends T> tuple) {
        return Arrays.asList(tuple._1, tuple._2, tuple._3, tuple._4, tuple._5, tuple._6, tuple._7, tuple._8, tuple._9, tuple._10, tuple._11, tuple._12, tuple._13, tuple._14, tuple._15, tuple._16, tuple._17, tuple._18, tuple._19, tuple._20, tuple._21, tuple._22);
    }
    
    public static Tuple of(Object... ts) {
        switch (ts.length) {
            case 0: return Tuple.of();
            case 1: return Tuple.of(ts[0]);
            case 2: return Tuple.of(ts[0], ts[1]);
            case 3: return Tuple.of(ts[0], ts[1], ts[2]);
            case 4: return Tuple.of(ts[0], ts[1], ts[2], ts[3]);
            case 5: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4]);
            case 6: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5]);
            case 7: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6]);
            case 8: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7]);
            case 9: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8]);
            case 10: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9]);
            case 11: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10]);
            case 12: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11]);
            case 13: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11], ts[12]);
            case 14: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11], ts[12], ts[13]);
            case 15: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11], ts[12], ts[13], ts[14]);
            case 16: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11], ts[12], ts[13], ts[14], ts[15]);
            case 17: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11], ts[12], ts[13], ts[14], ts[15], ts[16]);
            case 18: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11], ts[12], ts[13], ts[14], ts[15], ts[16], ts[17]);
            case 19: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11], ts[12], ts[13], ts[14], ts[15], ts[16], ts[17], ts[18]);
            case 20: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11], ts[12], ts[13], ts[14], ts[15], ts[16], ts[17], ts[18], ts[19]);
            case 21: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11], ts[12], ts[13], ts[14], ts[15], ts[16], ts[17], ts[18], ts[19], ts[20]);
            case 22: return Tuple.of(ts[0], ts[1], ts[2], ts[3], ts[4], ts[5], ts[6], ts[7], ts[8], ts[9], ts[10], ts[11], ts[12], ts[13], ts[14], ts[15], ts[16], ts[17], ts[18], ts[19], ts[20], ts[21]);
        }
        throw new UnsupportedOperationException("Tuple23 not implemented");
    }
    
    public static Tuple0 of() {
        return new Tuple0();
    }
    
    public static <T1> Tuple1<T1> of(T1 _1) {
        return new Tuple1<T1>(_1);
    }
    
    public static <T1, T2> Tuple2<T1, T2> of(T1 _1, T2 _2) {
        return new Tuple2<T1, T2>(_1, _2);
    }
    
    public static <T1, T2, T3> Tuple3<T1, T2, T3> of(T1 _1, T2 _2, T3 _3) {
        return new Tuple3<T1, T2, T3>(_1, _2, _3);
    }
    
    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> of(T1 _1, T2 _2, T3 _3, T4 _4) {
        return new Tuple4<T1, T2, T3, T4>(_1, _2, _3, _4);
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5) {
        return new Tuple5<T1, T2, T3, T4, T5>(_1, _2, _3, _4, _5);
    }
    
    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6) {
        return new Tuple6<T1, T2, T3, T4, T5, T6>(_1, _2, _3, _4, _5, _6);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7) {
        return new Tuple7<T1, T2, T3, T4, T5, T6, T7>(_1, _2, _3, _4, _5, _6, _7);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        return new Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(_1, _2, _3, _4, _5, _6, _7, _8);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
        return new Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        return new Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11) {
        return new Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12) {
        return new Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13) {
        return new Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14) {
        return new Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15) {
        return new Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16) {
        return new Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17) {
        return new Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18) {
        return new Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18, T19 _19) {
        return new Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18, T19 _19, T20 _20) {
        return new Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18, T19 _19, T20 _20, T21 _21) {
        return new Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21);
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18, T19 _19, T20 _20, T21 _21, T22 _22) {
        return new Tuple22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22);
    }
    
    public static interface _1<T> {
        T get_1();
    }
    
    public static interface _2<T> {
        T get_2();
    }
    
    public static interface _3<T> {
        T get_3();
    }
    
    public static interface _4<T> {
        T get_4();
    }
    
    public static interface _5<T> {
        T get_5();
    }
    
    public static interface _6<T> {
        T get_6();
    }
    
    public static interface _7<T> {
        T get_7();
    }
    
    public static interface _8<T> {
        T get_8();
    }
    
    public static interface _9<T> {
        T get_9();
    }
    
    public static interface _10<T> {
        T get_10();
    }
    
    public static interface _11<T> {
        T get_11();
    }
    
    public static interface _12<T> {
        T get_12();
    }
    
    public static interface _13<T> {
        T get_13();
    }
    
    public static interface _14<T> {
        T get_14();
    }
    
    public static interface _15<T> {
        T get_15();
    }
    
    public static interface _16<T> {
        T get_16();
    }
    
    public static interface _17<T> {
        T get_17();
    }
    
    public static interface _18<T> {
        T get_18();
    }
    
    public static interface _19<T> {
        T get_19();
    }
    
    public static interface _20<T> {
        T get_20();
    }
    
    public static interface _21<T> {
        T get_21();
    }
    
    public static interface _22<T> {
        T get_22();
    }

    public abstract Object[] toArray();
    
    @Override
    public String toString() {
        return "(" + mkString(",", map(Transformers.toString, toArray())) + ")";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        for (Object o: toArray()) {
            result = prime * result + ((o == null) ? 0 : o.hashCode());
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        for (Map.Entry<Object,Object> o: zip(toArray(), ((Tuple)obj).toArray())) {
            if (o.getKey() == null) {
                if (o.getValue() != null)
                    return false;
            } else if (!o.getKey().equals(o.getValue()))
                return false;
        }
        return true;
    }
}
