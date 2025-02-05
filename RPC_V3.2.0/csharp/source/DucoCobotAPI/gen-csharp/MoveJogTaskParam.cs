/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class MoveJogTaskParam : TBase
{

  public int Jog_direction { get; set; }

  public int Jog_type { get; set; }

  public int Axis_num { get; set; }

  public double Vel { get; set; }

  public int Jog_coordinate { get; set; }

  public bool Use_step { get; set; }

  public double Step_jointValue { get; set; }

  public double Step_cartvalue { get; set; }

  public MoveJogTaskParam() {
  }

  public MoveJogTaskParam(int jog_direction, int jog_type, int axis_num, double vel, int jog_coordinate, bool use_step, double step_jointValue, double step_cartvalue) : this() {
    this.Jog_direction = jog_direction;
    this.Jog_type = jog_type;
    this.Axis_num = axis_num;
    this.Vel = vel;
    this.Jog_coordinate = jog_coordinate;
    this.Use_step = use_step;
    this.Step_jointValue = step_jointValue;
    this.Step_cartvalue = step_cartvalue;
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      bool isset_jog_direction = false;
      bool isset_jog_type = false;
      bool isset_axis_num = false;
      bool isset_vel = false;
      bool isset_jog_coordinate = false;
      bool isset_use_step = false;
      bool isset_step_jointValue = false;
      bool isset_step_cartvalue = false;
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.I32) {
              Jog_direction = iprot.ReadI32();
              isset_jog_direction = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              Jog_type = iprot.ReadI32();
              isset_jog_type = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              Axis_num = iprot.ReadI32();
              isset_axis_num = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Double) {
              Vel = iprot.ReadDouble();
              isset_vel = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I32) {
              Jog_coordinate = iprot.ReadI32();
              isset_jog_coordinate = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Bool) {
              Use_step = iprot.ReadBool();
              isset_use_step = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.Double) {
              Step_jointValue = iprot.ReadDouble();
              isset_step_jointValue = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.Double) {
              Step_cartvalue = iprot.ReadDouble();
              isset_step_cartvalue = true;
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
      if (!isset_jog_direction)
        throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Jog_direction not set");
      if (!isset_jog_type)
        throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Jog_type not set");
      if (!isset_axis_num)
        throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Axis_num not set");
      if (!isset_vel)
        throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Vel not set");
      if (!isset_jog_coordinate)
        throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Jog_coordinate not set");
      if (!isset_use_step)
        throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Use_step not set");
      if (!isset_step_jointValue)
        throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Step_jointValue not set");
      if (!isset_step_cartvalue)
        throw new TProtocolException(TProtocolException.INVALID_DATA, "required field Step_cartvalue not set");
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("MoveJogTaskParam");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      field.Name = "jog_direction";
      field.Type = TType.I32;
      field.ID = 1;
      oprot.WriteFieldBegin(field);
      oprot.WriteI32(Jog_direction);
      oprot.WriteFieldEnd();
      field.Name = "jog_type";
      field.Type = TType.I32;
      field.ID = 2;
      oprot.WriteFieldBegin(field);
      oprot.WriteI32(Jog_type);
      oprot.WriteFieldEnd();
      field.Name = "axis_num";
      field.Type = TType.I32;
      field.ID = 3;
      oprot.WriteFieldBegin(field);
      oprot.WriteI32(Axis_num);
      oprot.WriteFieldEnd();
      field.Name = "vel";
      field.Type = TType.Double;
      field.ID = 4;
      oprot.WriteFieldBegin(field);
      oprot.WriteDouble(Vel);
      oprot.WriteFieldEnd();
      field.Name = "jog_coordinate";
      field.Type = TType.I32;
      field.ID = 5;
      oprot.WriteFieldBegin(field);
      oprot.WriteI32(Jog_coordinate);
      oprot.WriteFieldEnd();
      field.Name = "use_step";
      field.Type = TType.Bool;
      field.ID = 6;
      oprot.WriteFieldBegin(field);
      oprot.WriteBool(Use_step);
      oprot.WriteFieldEnd();
      field.Name = "step_jointValue";
      field.Type = TType.Double;
      field.ID = 7;
      oprot.WriteFieldBegin(field);
      oprot.WriteDouble(Step_jointValue);
      oprot.WriteFieldEnd();
      field.Name = "step_cartvalue";
      field.Type = TType.Double;
      field.ID = 8;
      oprot.WriteFieldBegin(field);
      oprot.WriteDouble(Step_cartvalue);
      oprot.WriteFieldEnd();
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("MoveJogTaskParam(");
    __sb.Append(", Jog_direction: ");
    __sb.Append(Jog_direction);
    __sb.Append(", Jog_type: ");
    __sb.Append(Jog_type);
    __sb.Append(", Axis_num: ");
    __sb.Append(Axis_num);
    __sb.Append(", Vel: ");
    __sb.Append(Vel);
    __sb.Append(", Jog_coordinate: ");
    __sb.Append(Jog_coordinate);
    __sb.Append(", Use_step: ");
    __sb.Append(Use_step);
    __sb.Append(", Step_jointValue: ");
    __sb.Append(Step_jointValue);
    __sb.Append(", Step_cartvalue: ");
    __sb.Append(Step_cartvalue);
    __sb.Append(")");
    return __sb.ToString();
  }

}

