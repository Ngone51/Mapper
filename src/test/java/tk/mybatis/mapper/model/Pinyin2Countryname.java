package tk.mybatis.mapper.model;

/**
 * @author wuyi
 * @date 2017/11/26
 */
public enum Pinyin2Countryname {
    ZhongGuo("China"),
    MeiGuo("America");
    private String name;

    Pinyin2Countryname(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
