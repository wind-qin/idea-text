package com.fc.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexType {
        private Map<String,Object> map;
        private Set<String> set;
        private List<String> list;
        private Object[] array;

        public ComplexType(){

        }

        public void setMap( Map<String, Object> map ) {
                this.map = map;
        }

        public void setSet( Set<String> set ) {
                this.set = set;
        }

        public void setList( List<String> list ) {
                this.list = list;
        }

        public void setArray( Object[] array ) {
                this.array = array;
        }

        @Override
        public String toString() {
                return "ComplexType{" +
                        "map=" + map +
                        ", set=" + set +
                        ", list=" + list +
                        ", array=" + Arrays.toString(array) +
                        '}';
        }
}
