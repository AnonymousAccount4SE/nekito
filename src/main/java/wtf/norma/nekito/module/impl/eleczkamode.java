package wtf.norma.nekito.module.impl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import wtf.norma.nekito.event.Event;
import wtf.norma.nekito.event.impl.EventMotion;
import wtf.norma.nekito.event.impl.EventRender2D;
import wtf.norma.nekito.event.impl.EventUpdate;
import wtf.norma.nekito.exploit.ExploitInfo;
import wtf.norma.nekito.exploit.impl.creative.AnvilExploit;
import wtf.norma.nekito.exploit.impl.flood.AttackExploit;
import wtf.norma.nekito.helper.ChatHelper;
import wtf.norma.nekito.module.Module;
import wtf.norma.nekito.nekito;
import wtf.norma.nekito.util.font.Fonts;
import wtf.norma.nekito.util.render.RenderUtility;

import java.awt.*;


public class eleczkamode extends Module {


    // nudzilo mi sie ok?


    public eleczkamode() {
        super("eleczkamode", Category.OTHER, Keyboard.KEY_NONE);
    }

    @Override // insane shitcode polska.pl cry abt it
    public void onEnable() {


     //   ChatHelper.printMessage("this module is in beta(you can have issues with it)");
        // modules
        nekito.INSTANCE.getModuleManager().getModule(Speed.class).name = "onichan supido";
        nekito.INSTANCE.getModuleManager().getModule(KillAura.class).name = "KillUwUra";
        nekito.INSTANCE.getModuleManager().getModule(TargetStrafe.class).name = "Tauwued strowow";
        nekito.INSTANCE.getModuleManager().getModule(Velocity.class).name = "Vewocity";
        nekito.INSTANCE.getModuleManager().getModule(HitBox.class).name = "Hitbowox";
        nekito.INSTANCE.getModuleManager().getModule(AutoClicker.class).name = "AuwutoCiker";
        nekito.INSTANCE.getModuleManager().getModule(AimBot.class).name = "AuwBiot";
        nekito.INSTANCE.getModuleManager().getModule(Reach.class).name = "Rewch";
        nekito.INSTANCE.getModuleManager().getModule(Sprint.class).name = "Spwint";
        nekito.INSTANCE.getModuleManager().getModule(Fly.class).name = "Fluwt";
        nekito.INSTANCE.getModuleManager().getModule(NoSlowDown.class).name = "NOwOsluwDown";
        nekito.INSTANCE.getModuleManager().getModule(AirJump.class).name = "AirUwUmp";
        nekito.INSTANCE.getModuleManager().getModule(Stealer.class).name = "Steuwuer";
        nekito.INSTANCE.getModuleManager().getModule(ClickGUI.class).name = "ClickUwUi";
        nekito.INSTANCE.getModuleManager().getModule(Cape.class).name = "Cauwpe";
        nekito.INSTANCE.getModuleManager().getModule(ItemPhysics.class).name = "IwtemPhysic";
        nekito.INSTANCE.getModuleManager().getModule(FullBright.class).name = "Fuwbrit";
        nekito.INSTANCE.getModuleManager().getModule(CustomButtons.class).name = "CuwustomBuwttons";
        nekito.INSTANCE.getModuleManager().getModule(CustomModel.class).name = "CuwstommOwOdel";
        nekito.INSTANCE.getModuleManager().getModule(ServerInfo.class).name = "SeuwuerInfu";
        nekito.INSTANCE.getModuleManager().getModule(InventorySettings.class).name = "Gwui setuwnii";
        nekito.INSTANCE.getModuleManager().getModule(bandytakamera.class).name = "gorocamuwera";
        nekito.INSTANCE.getModuleManager().getModule(WorldColor.class).name = "WourdCowolowr";
        nekito.INSTANCE.getModuleManager().getModule(CrashGUI.class).name = "CrauwshGuwuI";
        nekito.INSTANCE.getModuleManager().getModule(Watermark.class).name = "WauterMaurk";
        nekito.INSTANCE.getModuleManager().getModule(Watermark2.class).name = "XauwuesWauterMaurk";
        nekito.INSTANCE.getModuleManager().getModule(Arraylist.class).name = "AuwrList";
        nekito.INSTANCE.getModuleManager().getModule(TargetHUD.class).name = "Tawwget HUD";
        nekito.INSTANCE.getModuleManager().getModule(NoWeather.class).name = "No Wauther";
        nekito.INSTANCE.getModuleManager().getModule(CustomHotbar.class).name = "CuwustomHoutbar";
        nekito.INSTANCE.getModuleManager().getModule(TimeChanger.class).name = "TimeChawwger";
        nekito.INSTANCE.getModuleManager().getModule(Wings.class).name = "Awwings";
        nekito.INSTANCE.getModuleManager().getModule(Ears.class).name = "Ewars";
        nekito.INSTANCE.getModuleManager().getModule(AntiVoid.class).name = "Awti Vowoit";
        nekito.INSTANCE.getModuleManager().getModule(HELIUMDDOS.class).name = "ekkore oni chan uwu";
        nekito.INSTANCE.getModuleManager().getModule(eleczkamode.class).name = "eweczka mowt";
        nekito.INSTANCE.getModuleManager().getModule(NoClip.class).name = "NowCliwp";
        nekito.INSTANCE.getModuleManager().getModule(Timer.class).name = "Timwmer";
        nekito.INSTANCE.getModuleManager().getModule(Criticals.class).name = "Criwtakals";
        nekito.INSTANCE.getModuleManager().getModule(FogColor.class).name = "Fowo Colowwr";

        //categories
        Category.COMBAT.name = "COwObat";
        Category.LEGIT.name = "Lewgit";
        Category.MOVEMENT.name = "Moveuwment";
        Category.VISUALS.name = "Viewuals";
        Category.OTHER.name = "Othwwer";
        Category.CRASHERS.name = "Crashuewrs Liswt";


        //exploits

        super.onEnable();
    }

    @Override
    public void onDisable() {  // insane shitcode polska.pl cry abt it
        nekito.INSTANCE.getModuleManager().getModule(Speed.class).name = "Player Speed"; // insane
        nekito.INSTANCE.getModuleManager().getModule(KillAura.class).name = "KillAura"; // insane
        nekito.INSTANCE.getModuleManager().getModule(Criticals.class).name = "Criticals";
        nekito.INSTANCE.getModuleManager().getModule(TargetStrafe.class).name = "Target Strafe";
        nekito.INSTANCE.getModuleManager().getModule(Velocity.class).name = "Velocity";
        nekito.INSTANCE.getModuleManager().getModule(HitBox.class).name = "HitBox";
        nekito.INSTANCE.getModuleManager().getModule(AutoClicker.class).name = "AutoClicker";
        nekito.INSTANCE.getModuleManager().getModule(AimBot.class).name = "AimBot";
        nekito.INSTANCE.getModuleManager().getModule(Reach.class).name = "Reach";
        nekito.INSTANCE.getModuleManager().getModule(Sprint.class).name = "Sprint";
        nekito.INSTANCE.getModuleManager().getModule(Fly.class).name = "Fly";
        nekito.INSTANCE.getModuleManager().getModule(TargetHUD.class).name = "Target HUD";
        nekito.INSTANCE.getModuleManager().getModule(NoSlowDown.class).name = "No Slow Down";
        nekito.INSTANCE.getModuleManager().getModule(AirJump.class).name = "AirJump";
        nekito.INSTANCE.getModuleManager().getModule(Stealer.class).name = "romanian simulator";
        nekito.INSTANCE.getModuleManager().getModule(ClickGUI.class).name = "ClickGUI";
        nekito.INSTANCE.getModuleManager().getModule(Cape.class).name = "Cape";
        nekito.INSTANCE.getModuleManager().getModule(ItemPhysics.class).name = "ItemPhysics";
        nekito.INSTANCE.getModuleManager().getModule(FullBright.class).name = "FullBright";
        nekito.INSTANCE.getModuleManager().getModule(CustomButtons.class).name = "CustomButtons";
        nekito.INSTANCE.getModuleManager().getModule(CustomModel.class).name = "CustomModel";
        nekito.INSTANCE.getModuleManager().getModule(ServerInfo.class).name = "ServerInfo";
        nekito.INSTANCE.getModuleManager().getModule(InventorySettings.class).name = "Gui Settings";
        nekito.INSTANCE.getModuleManager().getModule(bandytakamera.class).name = "bandytakamera";
        nekito.INSTANCE.getModuleManager().getModule(WorldColor.class).name = "WorldColor";
        nekito.INSTANCE.getModuleManager().getModule(CrashGUI.class).name = "CrashGUI";
        nekito.INSTANCE.getModuleManager().getModule(Watermark.class).name = "Watermark";
        nekito.INSTANCE.getModuleManager().getModule(Watermark2.class).name = "cfx watermark ";
        nekito.INSTANCE.getModuleManager().getModule(Arraylist.class).name = "Arraylist";
        nekito.INSTANCE.getModuleManager().getModule(NoWeather.class).name = "No Weather";
        nekito.INSTANCE.getModuleManager().getModule(CustomHotbar.class).name = "CustomHotbar";
        nekito.INSTANCE.getModuleManager().getModule(TimeChanger.class).name = "Time Changer";
        nekito.INSTANCE.getModuleManager().getModule(Wings.class).name = "Wings";
        nekito.INSTANCE.getModuleManager().getModule(Ears.class).name = "Ears";
        nekito.INSTANCE.getModuleManager().getModule(AntiVoid.class).name = "Anti Void";
        nekito.INSTANCE.getModuleManager().getModule(HELIUMDDOS.class).name = "helium auth disabler";
        nekito.INSTANCE.getModuleManager().getModule(eleczkamode.class).name = "eleczkamode";
        nekito.INSTANCE.getModuleManager().getModule(NoClip.class).name = "No Clip";
        nekito.INSTANCE.getModuleManager().getModule(Timer.class).name = "Timer";
        nekito.INSTANCE.getModuleManager().getModule(FogColor.class).name = "Fog Color";




        super.onDisable();
    }


    int x = 10;
    int y = 10;
    @Override
    public void onEvent(Event e) {
        if (e instanceof EventUpdate) {

            //    KillAura.name = "guwno";

        }

    }



}
