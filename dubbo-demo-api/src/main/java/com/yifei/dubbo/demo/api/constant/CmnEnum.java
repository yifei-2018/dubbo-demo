package com.yifei.dubbo.demo.api.constant;

/**
 * 公共枚举类
 *
 * @author yifei
 * @date 2018/4/5
 */
public class CmnEnum {

    /**
     * 书类型
     */
    public enum BookTypeEnum {

        /**
         * 励志
         */
        ENCOURAGEMENT("励志"),

        /**
         * 都市生活
         */
        CITY_LIFE("都市生活"),

        /**
         * 自传
         */
        MEMOIR("自传");

        private final String value;

        BookTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }

    /**
     * 球类型
     */
    public enum BallTypeEnum {
        /**
         * 羽毛球
         */
        BADMINTON(0, "羽毛球"),

        /**
         * 网球
         */
        PINGPONG(1, "网球"),

        /**
         * 台球
         */
        BASKETBALL(2, "台球");

        private int key;
        private String value;

        BallTypeEnum(int key, String value) {
            this.key = key;
            this.value = value;
        }

        /**
         * 通过key获取值
         *
         * @param key
         * @return 若无此key, 则返回null
         */
        public static String getName(int key) {
            for (BallTypeEnum c : BallTypeEnum.values()) {
                if (c.getKey() == key) {
                    return c.getValue();
                }
            }
            return null;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
