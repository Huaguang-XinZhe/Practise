package test;

import javax.sound.midi.*;

public class MiniMusicApp {
    public static void main(String[] args) {
        MiniMusicApp mini = new MiniMusicApp();
        mini.play();
    }
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 95, 127);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 127, 127);
            MidiEvent noteOff = new MidiEvent(b, 30);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
