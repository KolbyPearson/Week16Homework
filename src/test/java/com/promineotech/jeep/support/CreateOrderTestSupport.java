package com.promineotech.jeep.support;

public class CreateOrderTestSupport extends BaseTest{
  /**
   * 
   */
  protected String createOrderBody() {
    // @formatter:off
    return "{\r\n"
        + "  \"customer\":\"MORISON_LINA\",\r\n"
        + "  \"model\":\"WRANGLER\",\r\n"
        + "  \"trim\":\"Sport Altitude\",\r\n"
        + "  \"doors\":4,\r\n"
        + "  \"color\":\"EXT_NACHO\",\r\n"
        + "  \"engine\":\"2_0_TURBO\",\r\n"
        + "  \"tire\":\"35_TOYO\",\r\n"
        + "  \"options\":[\r\n"
        + "    \"DOOR_QUAD_4\",\r\n"
        + "    \"EXT_AEV_LIFT\",\r\n"
        + "    \"EXT_WARN_WINCH\",\r\n"
        + "    \"EXT_WARN_BUMPER_FRONT\",\r\n"
        + "    \"EXT_WARN_BUMPER_REAR\",\r\n"
        + "    \"EXT_ARB_COMPRESSOR\"\r\n"
        + "  ]\r\n"
        + "}";
    //@formatter:on
  }

}
