package frc.robot;


public final class Constants {
  public static final class ModuleConstants {
    public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
    public static final double kDriveMotorGearRatio = 1 / 3;
    public static final double kturningMotorgearRation = 1 / 4.8;
    public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiametermeters;
    public static final double KTurningEncoderRot2Rad = kturningMotorgearratio * 2 * Math.PI;
    public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
    public static final double KTurningEncoderRPM2RadPerSec = KTurningEncoderRot2Rad / 60;
    public static final double kPTurning = 0.5;
  }
}
