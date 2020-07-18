package language_structure;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Boyka
 * E-mail: upcvagen@163.com
 * Date: 2020-07-18
 * Time: 下午12:52
 */
public enum PersonEnum {
    XIAO_WANG("小王"),
    ER_GOU("二狗");
    private String name;


    PersonEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static PersonEnum getPersonName(String name) {
        for (PersonEnum personEnum : PersonEnum.values()) {
            if (personEnum.getName().equals(name)) {
                return personEnum;
            }
        }
        return null;
    }


}
