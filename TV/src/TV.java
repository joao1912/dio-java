/**
 * Está classe controla uma tv com operações básicas
 * @author João Pedro
 * @since 07/05/2024
 * 
 */
public class TV {

    private boolean isOn = false;
    private int channel = 0;
    private int volume = 50;

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void changeStateOn() {

        this.isOn = !this.isOn;
        System.out.println("TV ligada!");

    }

    public int moreVolume() {

        this.volume += 1;
        return this.volume;

    }

    public int lessVolume() {

        this.volume -= 1;
        return this.volume;

    }

    /**
     * <h1>Trocar Canal</h1>
     * Este método troca o canal da tv.
     * @param channel Novo Canal
     * @return Canal Atualizado
     */
    public int changeChannel(int channel) {

        this.channel = channel;
        return this.channel;

    }

}
