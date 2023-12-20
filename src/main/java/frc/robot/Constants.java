package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;

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

  public static final class DriveConstants {

    public static final double kTrackWidth = Units.inchesToMeters(23.5);
    //distance between right and left wheels
    public static final double kWheelBase = Units.inchesToMeters( 23.5);
    //distance between front and back wheels
    public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
      new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
      new Translation2d(kWheelBase / 2, kTrackWidth / 2),
      new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
      new Translation2d(-kWheelBase / 2, kTrackWidth / 2));
    
    public static final int kFrontLeftDriveMotorPort = 3;
    public static final int kBackLeftDriveMotorPort = 1;
    public static final int kFrontRightDriveMotorPort = 14;
    public static final int kBackRightDriveMotorPort = 12;

    public static final int kFrontLeftTurningMotorPort = 2;
    public static final int kBackLeftTurningMotorPort = 0;
    public static final int kFrontRightTurningMotorPort = 15;
    public static final int kBackRightTurningMotorPort = 13;

    public static final Boolean kFrontLeftTurningEncoderReversed = true;
    public static final Boolean kBackLeftTurningEncoderReversed = true;
    public static final Boolean kFrontRightTurningEncoderReversed = true;
    public static final Boolean kBackRightTurningEncoderReversed = true;

    public static final Boolean kFrontLeftDiveEncoderReversed = true;
    public static final Boolean kBackLeftDriveEncoderReversed = true;
    public static final Boolean kFrontRightDriveEncoderReversed = false;
    public static final Boolean kBackRightDriveEndoderReversed = false;

    
  }
}
