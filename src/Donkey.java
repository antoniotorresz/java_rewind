import java.util.List;

public class Donkey extends Animal {
    String hg_name;
    int iq_level;

    List<String> actions;

    String shape;

    public Donkey(int id, String name, List<String> attributes, String hg_name, int iq_level, List<String> actions, String shape) {
        super(id, name, attributes);
        this.hg_name = hg_name;
        this.iq_level = iq_level;
        this.actions = actions;
        this.shape = shape;
    }

    public Donkey(String hg_name, int iq_level, List<String> actions, String shape) {
        this.hg_name = hg_name;
        this.iq_level = iq_level;
        this.actions = actions;
        this.shape = shape;
    }

    public Donkey() {
        this.shape =
                "                            What is Love? Baby don't hurt me                    \n" +
                        "                                                                    @&@     @&(@\n" +
                        "                                                                   (*&/%   @(%(@\n" +
                        "                                                                  @(&@*  @@(*## \n" +
                        "                                                                  #,%(#%*%&#(   \n" +
                        "                                                                 @&&,(((/(/**   \n" +
                        "                                                            , @&%&&#####((/#/*  \n" +
                        "                                                        @@@%&#%#%&#((((/##*(*(#.\n" +
                        "                                                      @@@%/(%#(%&&&@@@@##%%**#  \n" +
                        "                                                    @%#/%####%#%%#@&&%%#%%#&&#  \n" +
                        "            &##%%%%%&%&%#&%%%%%#%           #///&@/*##(#%%###(%%&#%@%&&&%##&#%/ \n" +
                        "        ##%##%#%%%(#%&###%%##&#(###%##((((///(/#&#(((##(#(%(#%#&&&&&&@@@@#,*,.. \n" +
                        "      %%#%#(##/(%%%%##%%###(#(##(#((((((#/((((/#&//(((/##(((#(#%&@@&@@@@%/*/**, \n" +
                        "    &%%%%##(##%&%%#((%%%%#%%#/#####(/%((#/(/*(//##(//((////##(#&&@@@@&@@&&@@@((&\n" +
                        "   &@%(%#%%(###/%%(###((%(#(%%#%/##((###%((((/(/*/(*(/(//(((/##%&&@@     @@%&&&&\n" +
                        "  /&@ %%#%%(#%#%#(#%#(##(##(/#(#((#(((#/(/(*/(/*/(%(/((/*//*//%%&&@        &@@  \n" +
                        "  &@@  %#(##(#%#((#&%%##(##((///(((%(##(//#((#(((/(##/((/*/*/(#%                \n" +
                        "  &@@   (%/((#(/((/#&%&(#####(((#####(//(#(#####/((#(#/(*/*,/##                 \n" +
                        " &&@@   %/##%((##(%@&(%#%#/##(#(#/(%(#(##(%%((##*(**/*(/**/**(                  \n" +
                        " &@@@    #/#%/((((@@@@(##(//(*//(*((/**//*/***%(##(/%%(///,//                   \n" +
                        " *%@@    ##/#((/#@@@    (%&#&####((/**/(*(//%&%%#(/*/*,*//                      \n" +
                        " @@@@    #(,**/&&                    ,          (****/*,*                       \n" +
                        " @@@@  &&%#(((&                                 .,*/(/*(                        \n" +
                        "  @@@ &#&&(#%                                   /(/#(*#/                        \n" +
                        "  (@@&&&%%((                                    %///(((                         \n" +
                        "  .@  @%&%(                                     #//#/(/                         \n" +
                        "     .@%%%#                                      %((#%                          \n" +
                        "      @#%&#                                      (((#                           \n" +
                        "     &%(&%#.                                     /(((                           \n" +
                        "      @@%%&%                                     #//(                           \n" +
                        "       @@&@&&                                   #@&#(#                          \n" +
                        "         @@%&&                                   @((%%@&                        \n" +
                        "          @%#%%                                  @&(/(@%#                       ";
    }

    public String getHg_name() {
        return hg_name;
    }

    public void setHg_name(String hg_name) {
        this.hg_name = hg_name;
    }

    public int getIq_level() {
        return iq_level;
    }

    public void setIq_level(int iq_level) {
        this.iq_level = iq_level;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Donkey{" +
                "hg_name='" + hg_name + '\'' +
                ", iq_level=" + iq_level +
                ", actions=" + actions +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", attributes=" + attributes +
                '}';
    }

    public void be_donkey() {
        System.out.println(this.shape);
    }
}
