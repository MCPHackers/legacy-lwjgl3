/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL11 {

    static { GL.initialize(); }

    public static final int
        GL_ACCUM  = 0x100,
        GL_LOAD   = 0x101,
        GL_RETURN = 0x102,
        GL_MULT   = 0x103,
        GL_ADD    = 0x104;

    public static final int
        GL_NEVER    = 0x200,
        GL_LESS     = 0x201,
        GL_EQUAL    = 0x202,
        GL_LEQUAL   = 0x203,
        GL_GREATER  = 0x204,
        GL_NOTEQUAL = 0x205,
        GL_GEQUAL   = 0x206,
        GL_ALWAYS   = 0x207;

    public static final int
        GL_CURRENT_BIT         = 0x1,
        GL_POINT_BIT           = 0x2,
        GL_LINE_BIT            = 0x4,
        GL_POLYGON_BIT         = 0x8,
        GL_POLYGON_STIPPLE_BIT = 0x10,
        GL_PIXEL_MODE_BIT      = 0x20,
        GL_LIGHTING_BIT        = 0x40,
        GL_FOG_BIT             = 0x80,
        GL_DEPTH_BUFFER_BIT    = 0x100,
        GL_ACCUM_BUFFER_BIT    = 0x200,
        GL_STENCIL_BUFFER_BIT  = 0x400,
        GL_VIEWPORT_BIT        = 0x800,
        GL_TRANSFORM_BIT       = 0x1000,
        GL_ENABLE_BIT          = 0x2000,
        GL_COLOR_BUFFER_BIT    = 0x4000,
        GL_HINT_BIT            = 0x8000,
        GL_EVAL_BIT            = 0x10000,
        GL_LIST_BIT            = 0x20000,
        GL_TEXTURE_BIT         = 0x40000,
        GL_SCISSOR_BIT         = 0x80000,
        GL_ALL_ATTRIB_BITS     = 0xFFFFF;

    public static final int
        GL_POINTS         = 0x0,
        GL_LINES          = 0x1,
        GL_LINE_LOOP      = 0x2,
        GL_LINE_STRIP     = 0x3,
        GL_TRIANGLES      = 0x4,
        GL_TRIANGLE_STRIP = 0x5,
        GL_TRIANGLE_FAN   = 0x6,
        GL_QUADS          = 0x7,
        GL_QUAD_STRIP     = 0x8,
        GL_POLYGON        = 0x9;

    public static final int
        GL_ZERO                = 0,
        GL_ONE                 = 1,
        GL_SRC_COLOR           = 0x300,
        GL_ONE_MINUS_SRC_COLOR = 0x301,
        GL_SRC_ALPHA           = 0x302,
        GL_ONE_MINUS_SRC_ALPHA = 0x303,
        GL_DST_ALPHA           = 0x304,
        GL_ONE_MINUS_DST_ALPHA = 0x305;

    public static final int
        GL_DST_COLOR           = 0x306,
        GL_ONE_MINUS_DST_COLOR = 0x307,
        GL_SRC_ALPHA_SATURATE  = 0x308;

    public static final int
        GL_TRUE  = 1,
        GL_FALSE = 0;

    public static final int
        GL_CLIP_PLANE0 = 0x3000,
        GL_CLIP_PLANE1 = 0x3001,
        GL_CLIP_PLANE2 = 0x3002,
        GL_CLIP_PLANE3 = 0x3003,
        GL_CLIP_PLANE4 = 0x3004,
        GL_CLIP_PLANE5 = 0x3005;

    public static final int
        GL_BYTE           = 0x1400,
        GL_UNSIGNED_BYTE  = 0x1401,
        GL_SHORT          = 0x1402,
        GL_UNSIGNED_SHORT = 0x1403,
        GL_INT            = 0x1404,
        GL_UNSIGNED_INT   = 0x1405,
        GL_FLOAT          = 0x1406,
        GL_2_BYTES        = 0x1407,
        GL_3_BYTES        = 0x1408,
        GL_4_BYTES        = 0x1409,
        GL_DOUBLE         = 0x140A;

    public static final int
        GL_NONE           = 0,
        GL_FRONT_LEFT     = 0x400,
        GL_FRONT_RIGHT    = 0x401,
        GL_BACK_LEFT      = 0x402,
        GL_BACK_RIGHT     = 0x403,
        GL_FRONT          = 0x404,
        GL_BACK           = 0x405,
        GL_LEFT           = 0x406,
        GL_RIGHT          = 0x407,
        GL_FRONT_AND_BACK = 0x408,
        GL_AUX0           = 0x409,
        GL_AUX1           = 0x40A,
        GL_AUX2           = 0x40B,
        GL_AUX3           = 0x40C;

    public static final int
        GL_NO_ERROR          = 0,
        GL_INVALID_ENUM      = 0x500,
        GL_INVALID_VALUE     = 0x501,
        GL_INVALID_OPERATION = 0x502,
        GL_STACK_OVERFLOW    = 0x503,
        GL_STACK_UNDERFLOW   = 0x504,
        GL_OUT_OF_MEMORY     = 0x505;

    public static final int
        GL_2D               = 0x600,
        GL_3D               = 0x601,
        GL_3D_COLOR         = 0x602,
        GL_3D_COLOR_TEXTURE = 0x603,
        GL_4D_COLOR_TEXTURE = 0x604;

    public static final int
        GL_PASS_THROUGH_TOKEN = 0x700,
        GL_POINT_TOKEN        = 0x701,
        GL_LINE_TOKEN         = 0x702,
        GL_POLYGON_TOKEN      = 0x703,
        GL_BITMAP_TOKEN       = 0x704,
        GL_DRAW_PIXEL_TOKEN   = 0x705,
        GL_COPY_PIXEL_TOKEN   = 0x706,
        GL_LINE_RESET_TOKEN   = 0x707;

    public static final int
        GL_EXP  = 0x800,
        GL_EXP2 = 0x801;

    public static final int
        GL_CW  = 0x900,
        GL_CCW = 0x901;

    public static final int
        GL_COEFF  = 0xA00,
        GL_ORDER  = 0xA01,
        GL_DOMAIN = 0xA02;

    public static final int
        GL_CURRENT_COLOR                 = 0xB00,
        GL_CURRENT_INDEX                 = 0xB01,
        GL_CURRENT_NORMAL                = 0xB02,
        GL_CURRENT_TEXTURE_COORDS        = 0xB03,
        GL_CURRENT_RASTER_COLOR          = 0xB04,
        GL_CURRENT_RASTER_INDEX          = 0xB05,
        GL_CURRENT_RASTER_TEXTURE_COORDS = 0xB06,
        GL_CURRENT_RASTER_POSITION       = 0xB07,
        GL_CURRENT_RASTER_POSITION_VALID = 0xB08,
        GL_CURRENT_RASTER_DISTANCE       = 0xB09,
        GL_POINT_SMOOTH                  = 0xB10,
        GL_POINT_SIZE                    = 0xB11,
        GL_POINT_SIZE_RANGE              = 0xB12,
        GL_POINT_SIZE_GRANULARITY        = 0xB13,
        GL_LINE_SMOOTH                   = 0xB20,
        GL_LINE_WIDTH                    = 0xB21,
        GL_LINE_WIDTH_RANGE              = 0xB22,
        GL_LINE_WIDTH_GRANULARITY        = 0xB23,
        GL_LINE_STIPPLE                  = 0xB24,
        GL_LINE_STIPPLE_PATTERN          = 0xB25,
        GL_LINE_STIPPLE_REPEAT           = 0xB26,
        GL_LIST_MODE                     = 0xB30,
        GL_MAX_LIST_NESTING              = 0xB31,
        GL_LIST_BASE                     = 0xB32,
        GL_LIST_INDEX                    = 0xB33,
        GL_POLYGON_MODE                  = 0xB40,
        GL_POLYGON_SMOOTH                = 0xB41,
        GL_POLYGON_STIPPLE               = 0xB42,
        GL_EDGE_FLAG                     = 0xB43,
        GL_CULL_FACE                     = 0xB44,
        GL_CULL_FACE_MODE                = 0xB45,
        GL_FRONT_FACE                    = 0xB46,
        GL_LIGHTING                      = 0xB50,
        GL_LIGHT_MODEL_LOCAL_VIEWER      = 0xB51,
        GL_LIGHT_MODEL_TWO_SIDE          = 0xB52,
        GL_LIGHT_MODEL_AMBIENT           = 0xB53,
        GL_SHADE_MODEL                   = 0xB54,
        GL_COLOR_MATERIAL_FACE           = 0xB55,
        GL_COLOR_MATERIAL_PARAMETER      = 0xB56,
        GL_COLOR_MATERIAL                = 0xB57,
        GL_FOG                           = 0xB60,
        GL_FOG_INDEX                     = 0xB61,
        GL_FOG_DENSITY                   = 0xB62,
        GL_FOG_START                     = 0xB63,
        GL_FOG_END                       = 0xB64,
        GL_FOG_MODE                      = 0xB65,
        GL_FOG_COLOR                     = 0xB66,
        GL_DEPTH_RANGE                   = 0xB70,
        GL_DEPTH_TEST                    = 0xB71,
        GL_DEPTH_WRITEMASK               = 0xB72,
        GL_DEPTH_CLEAR_VALUE             = 0xB73,
        GL_DEPTH_FUNC                    = 0xB74,
        GL_ACCUM_CLEAR_VALUE             = 0xB80,
        GL_STENCIL_TEST                  = 0xB90,
        GL_STENCIL_CLEAR_VALUE           = 0xB91,
        GL_STENCIL_FUNC                  = 0xB92,
        GL_STENCIL_VALUE_MASK            = 0xB93,
        GL_STENCIL_FAIL                  = 0xB94,
        GL_STENCIL_PASS_DEPTH_FAIL       = 0xB95,
        GL_STENCIL_PASS_DEPTH_PASS       = 0xB96,
        GL_STENCIL_REF                   = 0xB97,
        GL_STENCIL_WRITEMASK             = 0xB98,
        GL_MATRIX_MODE                   = 0xBA0,
        GL_NORMALIZE                     = 0xBA1,
        GL_VIEWPORT                      = 0xBA2,
        GL_MODELVIEW_STACK_DEPTH         = 0xBA3,
        GL_PROJECTION_STACK_DEPTH        = 0xBA4,
        GL_TEXTURE_STACK_DEPTH           = 0xBA5,
        GL_MODELVIEW_MATRIX              = 0xBA6,
        GL_PROJECTION_MATRIX             = 0xBA7,
        GL_TEXTURE_MATRIX                = 0xBA8,
        GL_ATTRIB_STACK_DEPTH            = 0xBB0,
        GL_CLIENT_ATTRIB_STACK_DEPTH     = 0xBB1,
        GL_ALPHA_TEST                    = 0xBC0,
        GL_ALPHA_TEST_FUNC               = 0xBC1,
        GL_ALPHA_TEST_REF                = 0xBC2,
        GL_DITHER                        = 0xBD0,
        GL_BLEND_DST                     = 0xBE0,
        GL_BLEND_SRC                     = 0xBE1,
        GL_BLEND                         = 0xBE2,
        GL_LOGIC_OP_MODE                 = 0xBF0,
        GL_INDEX_LOGIC_OP                = 0xBF1,
        GL_LOGIC_OP                      = 0xBF1,
        GL_COLOR_LOGIC_OP                = 0xBF2,
        GL_AUX_BUFFERS                   = 0xC00,
        GL_DRAW_BUFFER                   = 0xC01,
        GL_READ_BUFFER                   = 0xC02,
        GL_SCISSOR_BOX                   = 0xC10,
        GL_SCISSOR_TEST                  = 0xC11,
        GL_INDEX_CLEAR_VALUE             = 0xC20,
        GL_INDEX_WRITEMASK               = 0xC21,
        GL_COLOR_CLEAR_VALUE             = 0xC22,
        GL_COLOR_WRITEMASK               = 0xC23,
        GL_INDEX_MODE                    = 0xC30,
        GL_RGBA_MODE                     = 0xC31,
        GL_DOUBLEBUFFER                  = 0xC32,
        GL_STEREO                        = 0xC33,
        GL_RENDER_MODE                   = 0xC40,
        GL_PERSPECTIVE_CORRECTION_HINT   = 0xC50,
        GL_POINT_SMOOTH_HINT             = 0xC51,
        GL_LINE_SMOOTH_HINT              = 0xC52,
        GL_POLYGON_SMOOTH_HINT           = 0xC53,
        GL_FOG_HINT                      = 0xC54,
        GL_TEXTURE_GEN_S                 = 0xC60,
        GL_TEXTURE_GEN_T                 = 0xC61,
        GL_TEXTURE_GEN_R                 = 0xC62,
        GL_TEXTURE_GEN_Q                 = 0xC63,
        GL_PIXEL_MAP_I_TO_I              = 0xC70,
        GL_PIXEL_MAP_S_TO_S              = 0xC71,
        GL_PIXEL_MAP_I_TO_R              = 0xC72,
        GL_PIXEL_MAP_I_TO_G              = 0xC73,
        GL_PIXEL_MAP_I_TO_B              = 0xC74,
        GL_PIXEL_MAP_I_TO_A              = 0xC75,
        GL_PIXEL_MAP_R_TO_R              = 0xC76,
        GL_PIXEL_MAP_G_TO_G              = 0xC77,
        GL_PIXEL_MAP_B_TO_B              = 0xC78,
        GL_PIXEL_MAP_A_TO_A              = 0xC79,
        GL_PIXEL_MAP_I_TO_I_SIZE         = 0xCB0,
        GL_PIXEL_MAP_S_TO_S_SIZE         = 0xCB1,
        GL_PIXEL_MAP_I_TO_R_SIZE         = 0xCB2,
        GL_PIXEL_MAP_I_TO_G_SIZE         = 0xCB3,
        GL_PIXEL_MAP_I_TO_B_SIZE         = 0xCB4,
        GL_PIXEL_MAP_I_TO_A_SIZE         = 0xCB5,
        GL_PIXEL_MAP_R_TO_R_SIZE         = 0xCB6,
        GL_PIXEL_MAP_G_TO_G_SIZE         = 0xCB7,
        GL_PIXEL_MAP_B_TO_B_SIZE         = 0xCB8,
        GL_PIXEL_MAP_A_TO_A_SIZE         = 0xCB9,
        GL_UNPACK_SWAP_BYTES             = 0xCF0,
        GL_UNPACK_LSB_FIRST              = 0xCF1,
        GL_UNPACK_ROW_LENGTH             = 0xCF2,
        GL_UNPACK_SKIP_ROWS              = 0xCF3,
        GL_UNPACK_SKIP_PIXELS            = 0xCF4,
        GL_UNPACK_ALIGNMENT              = 0xCF5,
        GL_PACK_SWAP_BYTES               = 0xD00,
        GL_PACK_LSB_FIRST                = 0xD01,
        GL_PACK_ROW_LENGTH               = 0xD02,
        GL_PACK_SKIP_ROWS                = 0xD03,
        GL_PACK_SKIP_PIXELS              = 0xD04,
        GL_PACK_ALIGNMENT                = 0xD05,
        GL_MAP_COLOR                     = 0xD10,
        GL_MAP_STENCIL                   = 0xD11,
        GL_INDEX_SHIFT                   = 0xD12,
        GL_INDEX_OFFSET                  = 0xD13,
        GL_RED_SCALE                     = 0xD14,
        GL_RED_BIAS                      = 0xD15,
        GL_ZOOM_X                        = 0xD16,
        GL_ZOOM_Y                        = 0xD17,
        GL_GREEN_SCALE                   = 0xD18,
        GL_GREEN_BIAS                    = 0xD19,
        GL_BLUE_SCALE                    = 0xD1A,
        GL_BLUE_BIAS                     = 0xD1B,
        GL_ALPHA_SCALE                   = 0xD1C,
        GL_ALPHA_BIAS                    = 0xD1D,
        GL_DEPTH_SCALE                   = 0xD1E,
        GL_DEPTH_BIAS                    = 0xD1F,
        GL_MAX_EVAL_ORDER                = 0xD30,
        GL_MAX_LIGHTS                    = 0xD31,
        GL_MAX_CLIP_PLANES               = 0xD32,
        GL_MAX_TEXTURE_SIZE              = 0xD33,
        GL_MAX_PIXEL_MAP_TABLE           = 0xD34,
        GL_MAX_ATTRIB_STACK_DEPTH        = 0xD35,
        GL_MAX_MODELVIEW_STACK_DEPTH     = 0xD36,
        GL_MAX_NAME_STACK_DEPTH          = 0xD37,
        GL_MAX_PROJECTION_STACK_DEPTH    = 0xD38,
        GL_MAX_TEXTURE_STACK_DEPTH       = 0xD39,
        GL_MAX_VIEWPORT_DIMS             = 0xD3A,
        GL_MAX_CLIENT_ATTRIB_STACK_DEPTH = 0xD3B,
        GL_SUBPIXEL_BITS                 = 0xD50,
        GL_INDEX_BITS                    = 0xD51,
        GL_RED_BITS                      = 0xD52,
        GL_GREEN_BITS                    = 0xD53,
        GL_BLUE_BITS                     = 0xD54,
        GL_ALPHA_BITS                    = 0xD55,
        GL_DEPTH_BITS                    = 0xD56,
        GL_STENCIL_BITS                  = 0xD57,
        GL_ACCUM_RED_BITS                = 0xD58,
        GL_ACCUM_GREEN_BITS              = 0xD59,
        GL_ACCUM_BLUE_BITS               = 0xD5A,
        GL_ACCUM_ALPHA_BITS              = 0xD5B,
        GL_NAME_STACK_DEPTH              = 0xD70,
        GL_AUTO_NORMAL                   = 0xD80,
        GL_MAP1_COLOR_4                  = 0xD90,
        GL_MAP1_INDEX                    = 0xD91,
        GL_MAP1_NORMAL                   = 0xD92,
        GL_MAP1_TEXTURE_COORD_1          = 0xD93,
        GL_MAP1_TEXTURE_COORD_2          = 0xD94,
        GL_MAP1_TEXTURE_COORD_3          = 0xD95,
        GL_MAP1_TEXTURE_COORD_4          = 0xD96,
        GL_MAP1_VERTEX_3                 = 0xD97,
        GL_MAP1_VERTEX_4                 = 0xD98,
        GL_MAP2_COLOR_4                  = 0xDB0,
        GL_MAP2_INDEX                    = 0xDB1,
        GL_MAP2_NORMAL                   = 0xDB2,
        GL_MAP2_TEXTURE_COORD_1          = 0xDB3,
        GL_MAP2_TEXTURE_COORD_2          = 0xDB4,
        GL_MAP2_TEXTURE_COORD_3          = 0xDB5,
        GL_MAP2_TEXTURE_COORD_4          = 0xDB6,
        GL_MAP2_VERTEX_3                 = 0xDB7,
        GL_MAP2_VERTEX_4                 = 0xDB8,
        GL_MAP1_GRID_DOMAIN              = 0xDD0,
        GL_MAP1_GRID_SEGMENTS            = 0xDD1,
        GL_MAP2_GRID_DOMAIN              = 0xDD2,
        GL_MAP2_GRID_SEGMENTS            = 0xDD3,
        GL_TEXTURE_1D                    = 0xDE0,
        GL_TEXTURE_2D                    = 0xDE1,
        GL_FEEDBACK_BUFFER_POINTER       = 0xDF0,
        GL_FEEDBACK_BUFFER_SIZE          = 0xDF1,
        GL_FEEDBACK_BUFFER_TYPE          = 0xDF2,
        GL_SELECTION_BUFFER_POINTER      = 0xDF3,
        GL_SELECTION_BUFFER_SIZE         = 0xDF4;

    public static final int
        GL_TEXTURE_WIDTH           = 0x1000,
        GL_TEXTURE_HEIGHT          = 0x1001,
        GL_TEXTURE_INTERNAL_FORMAT = 0x1003,
        GL_TEXTURE_COMPONENTS      = 0x1003,
        GL_TEXTURE_BORDER_COLOR    = 0x1004,
        GL_TEXTURE_BORDER          = 0x1005;

    public static final int
        GL_DONT_CARE = 0x1100,
        GL_FASTEST   = 0x1101,
        GL_NICEST    = 0x1102;

    public static final int
        GL_LIGHT0 = 0x4000,
        GL_LIGHT1 = 0x4001,
        GL_LIGHT2 = 0x4002,
        GL_LIGHT3 = 0x4003,
        GL_LIGHT4 = 0x4004,
        GL_LIGHT5 = 0x4005,
        GL_LIGHT6 = 0x4006,
        GL_LIGHT7 = 0x4007;

    public static final int
        GL_AMBIENT               = 0x1200,
        GL_DIFFUSE               = 0x1201,
        GL_SPECULAR              = 0x1202,
        GL_POSITION              = 0x1203,
        GL_SPOT_DIRECTION        = 0x1204,
        GL_SPOT_EXPONENT         = 0x1205,
        GL_SPOT_CUTOFF           = 0x1206,
        GL_CONSTANT_ATTENUATION  = 0x1207,
        GL_LINEAR_ATTENUATION    = 0x1208,
        GL_QUADRATIC_ATTENUATION = 0x1209;

    public static final int
        GL_COMPILE             = 0x1300,
        GL_COMPILE_AND_EXECUTE = 0x1301;

    public static final int
        GL_CLEAR         = 0x1500,
        GL_AND           = 0x1501,
        GL_AND_REVERSE   = 0x1502,
        GL_COPY          = 0x1503,
        GL_AND_INVERTED  = 0x1504,
        GL_NOOP          = 0x1505,
        GL_XOR           = 0x1506,
        GL_OR            = 0x1507,
        GL_NOR           = 0x1508,
        GL_EQUIV         = 0x1509,
        GL_INVERT        = 0x150A,
        GL_OR_REVERSE    = 0x150B,
        GL_COPY_INVERTED = 0x150C,
        GL_OR_INVERTED   = 0x150D,
        GL_NAND          = 0x150E,
        GL_SET           = 0x150F;

    public static final int
        GL_EMISSION            = 0x1600,
        GL_SHININESS           = 0x1601,
        GL_AMBIENT_AND_DIFFUSE = 0x1602,
        GL_COLOR_INDEXES       = 0x1603;

    public static final int
        GL_MODELVIEW  = 0x1700,
        GL_PROJECTION = 0x1701,
        GL_TEXTURE    = 0x1702;

    public static final int
        GL_COLOR   = 0x1800,
        GL_DEPTH   = 0x1801,
        GL_STENCIL = 0x1802;

    public static final int
        GL_COLOR_INDEX     = 0x1900,
        GL_STENCIL_INDEX   = 0x1901,
        GL_DEPTH_COMPONENT = 0x1902,
        GL_RED             = 0x1903,
        GL_GREEN           = 0x1904,
        GL_BLUE            = 0x1905,
        GL_ALPHA           = 0x1906,
        GL_RGB             = 0x1907,
        GL_RGBA            = 0x1908,
        GL_LUMINANCE       = 0x1909,
        GL_LUMINANCE_ALPHA = 0x190A;

    public static final int GL_BITMAP = 0x1A00;

    public static final int
        GL_POINT = 0x1B00,
        GL_LINE  = 0x1B01,
        GL_FILL  = 0x1B02;

    public static final int
        GL_RENDER   = 0x1C00,
        GL_FEEDBACK = 0x1C01,
        GL_SELECT   = 0x1C02;

    public static final int
        GL_FLAT   = 0x1D00,
        GL_SMOOTH = 0x1D01;

    public static final int
        GL_KEEP    = 0x1E00,
        GL_REPLACE = 0x1E01,
        GL_INCR    = 0x1E02,
        GL_DECR    = 0x1E03;

    public static final int
        GL_VENDOR     = 0x1F00,
        GL_RENDERER   = 0x1F01,
        GL_VERSION    = 0x1F02,
        GL_EXTENSIONS = 0x1F03;

    public static final int
        GL_S = 0x2000,
        GL_T = 0x2001,
        GL_R = 0x2002,
        GL_Q = 0x2003;

    public static final int
        GL_MODULATE = 0x2100,
        GL_DECAL    = 0x2101;

    public static final int
        GL_TEXTURE_ENV_MODE  = 0x2200,
        GL_TEXTURE_ENV_COLOR = 0x2201;

    public static final int GL_TEXTURE_ENV = 0x2300;

    public static final int
        GL_EYE_LINEAR    = 0x2400,
        GL_OBJECT_LINEAR = 0x2401,
        GL_SPHERE_MAP    = 0x2402;

    public static final int
        GL_TEXTURE_GEN_MODE = 0x2500,
        GL_OBJECT_PLANE     = 0x2501,
        GL_EYE_PLANE        = 0x2502;

    public static final int
        GL_NEAREST = 0x2600,
        GL_LINEAR  = 0x2601;

    public static final int
        GL_NEAREST_MIPMAP_NEAREST = 0x2700,
        GL_LINEAR_MIPMAP_NEAREST  = 0x2701,
        GL_NEAREST_MIPMAP_LINEAR  = 0x2702,
        GL_LINEAR_MIPMAP_LINEAR   = 0x2703;

    public static final int
        GL_TEXTURE_MAG_FILTER = 0x2800,
        GL_TEXTURE_MIN_FILTER = 0x2801,
        GL_TEXTURE_WRAP_S     = 0x2802,
        GL_TEXTURE_WRAP_T     = 0x2803;

    public static final int
        GL_CLAMP  = 0x2900,
        GL_REPEAT = 0x2901;

    public static final int
        GL_CLIENT_PIXEL_STORE_BIT  = 0x1,
        GL_CLIENT_VERTEX_ARRAY_BIT = 0x2,
        GL_CLIENT_ALL_ATTRIB_BITS  = 0xFFFFFFFF;

    public static final int
        GL_POLYGON_OFFSET_FACTOR = 0x8038,
        GL_POLYGON_OFFSET_UNITS  = 0x2A00,
        GL_POLYGON_OFFSET_POINT  = 0x2A01,
        GL_POLYGON_OFFSET_LINE   = 0x2A02,
        GL_POLYGON_OFFSET_FILL   = 0x8037;

    public static final int
        GL_ALPHA4                 = 0x803B,
        GL_ALPHA8                 = 0x803C,
        GL_ALPHA12                = 0x803D,
        GL_ALPHA16                = 0x803E,
        GL_LUMINANCE4             = 0x803F,
        GL_LUMINANCE8             = 0x8040,
        GL_LUMINANCE12            = 0x8041,
        GL_LUMINANCE16            = 0x8042,
        GL_LUMINANCE4_ALPHA4      = 0x8043,
        GL_LUMINANCE6_ALPHA2      = 0x8044,
        GL_LUMINANCE8_ALPHA8      = 0x8045,
        GL_LUMINANCE12_ALPHA4     = 0x8046,
        GL_LUMINANCE12_ALPHA12    = 0x8047,
        GL_LUMINANCE16_ALPHA16    = 0x8048,
        GL_INTENSITY              = 0x8049,
        GL_INTENSITY4             = 0x804A,
        GL_INTENSITY8             = 0x804B,
        GL_INTENSITY12            = 0x804C,
        GL_INTENSITY16            = 0x804D,
        GL_R3_G3_B2               = 0x2A10,
        GL_RGB4                   = 0x804F,
        GL_RGB5                   = 0x8050,
        GL_RGB8                   = 0x8051,
        GL_RGB10                  = 0x8052,
        GL_RGB12                  = 0x8053,
        GL_RGB16                  = 0x8054,
        GL_RGBA2                  = 0x8055,
        GL_RGBA4                  = 0x8056,
        GL_RGB5_A1                = 0x8057,
        GL_RGBA8                  = 0x8058,
        GL_RGB10_A2               = 0x8059,
        GL_RGBA12                 = 0x805A,
        GL_RGBA16                 = 0x805B,
        GL_TEXTURE_RED_SIZE       = 0x805C,
        GL_TEXTURE_GREEN_SIZE     = 0x805D,
        GL_TEXTURE_BLUE_SIZE      = 0x805E,
        GL_TEXTURE_ALPHA_SIZE     = 0x805F,
        GL_TEXTURE_LUMINANCE_SIZE = 0x8060,
        GL_TEXTURE_INTENSITY_SIZE = 0x8061,
        GL_PROXY_TEXTURE_1D       = 0x8063,
        GL_PROXY_TEXTURE_2D       = 0x8064;

    public static final int
        GL_TEXTURE_PRIORITY   = 0x8066,
        GL_TEXTURE_RESIDENT   = 0x8067,
        GL_TEXTURE_BINDING_1D = 0x8068,
        GL_TEXTURE_BINDING_2D = 0x8069;

    public static final int
        GL_VERTEX_ARRAY                = 0x8074,
        GL_NORMAL_ARRAY                = 0x8075,
        GL_COLOR_ARRAY                 = 0x8076,
        GL_INDEX_ARRAY                 = 0x8077,
        GL_TEXTURE_COORD_ARRAY         = 0x8078,
        GL_EDGE_FLAG_ARRAY             = 0x8079,
        GL_VERTEX_ARRAY_SIZE           = 0x807A,
        GL_VERTEX_ARRAY_TYPE           = 0x807B,
        GL_VERTEX_ARRAY_STRIDE         = 0x807C,
        GL_NORMAL_ARRAY_TYPE           = 0x807E,
        GL_NORMAL_ARRAY_STRIDE         = 0x807F,
        GL_COLOR_ARRAY_SIZE            = 0x8081,
        GL_COLOR_ARRAY_TYPE            = 0x8082,
        GL_COLOR_ARRAY_STRIDE          = 0x8083,
        GL_INDEX_ARRAY_TYPE            = 0x8085,
        GL_INDEX_ARRAY_STRIDE          = 0x8086,
        GL_TEXTURE_COORD_ARRAY_SIZE    = 0x8088,
        GL_TEXTURE_COORD_ARRAY_TYPE    = 0x8089,
        GL_TEXTURE_COORD_ARRAY_STRIDE  = 0x808A,
        GL_EDGE_FLAG_ARRAY_STRIDE      = 0x808C,
        GL_VERTEX_ARRAY_POINTER        = 0x808E,
        GL_NORMAL_ARRAY_POINTER        = 0x808F,
        GL_COLOR_ARRAY_POINTER         = 0x8090,
        GL_INDEX_ARRAY_POINTER         = 0x8091,
        GL_TEXTURE_COORD_ARRAY_POINTER = 0x8092,
        GL_EDGE_FLAG_ARRAY_POINTER     = 0x8093,
        GL_V2F                         = 0x2A20,
        GL_V3F                         = 0x2A21,
        GL_C4UB_V2F                    = 0x2A22,
        GL_C4UB_V3F                    = 0x2A23,
        GL_C3F_V3F                     = 0x2A24,
        GL_N3F_V3F                     = 0x2A25,
        GL_C4F_N3F_V3F                 = 0x2A26,
        GL_T2F_V3F                     = 0x2A27,
        GL_T4F_V4F                     = 0x2A28,
        GL_T2F_C4UB_V3F                = 0x2A29,
        GL_T2F_C3F_V3F                 = 0x2A2A,
        GL_T2F_N3F_V3F                 = 0x2A2B,
        GL_T2F_C4F_N3F_V3F             = 0x2A2C,
        GL_T4F_C4F_N3F_V4F             = 0x2A2D;

    protected GL11() {
        throw new UnsupportedOperationException();
    }

    public static void glEnable(@NativeType("GLenum") int target) {
        GL11C.glEnable(target);
    }

    public static void glDisable(@NativeType("GLenum") int target) {
        GL11C.glDisable(target);
    }

    public static native void glAccum(@NativeType("GLenum") int op, @NativeType("GLfloat") float value);

    public static native void glAlphaFunc(@NativeType("GLenum") int func, @NativeType("GLfloat") float ref);

    public static native boolean nglAreTexturesResident(int n, long textures, long residences);

    @NativeType("GLboolean")
    public static boolean glAreTexturesResident(@NativeType("GLuint const *") IntBuffer textures, @NativeType("GLboolean *") ByteBuffer residences) {
        if (CHECKS) {
            check(residences, textures.remaining());
        }
        return nglAreTexturesResident(textures.remaining(), memAddress(textures), memAddress(residences));
    }

    @NativeType("GLboolean")
    public static boolean glAreTexturesResident(@NativeType("GLuint const *") int texture, @NativeType("GLboolean *") ByteBuffer residences) {
        if (CHECKS) {
            check(residences, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer textures = stack.ints(texture);
            return nglAreTexturesResident(1, memAddress(textures), memAddress(residences));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void glArrayElement(@NativeType("GLint") int i);

    public static native void glBegin(@NativeType("GLenum") int mode);

    public static void glBindTexture(@NativeType("GLenum") int target, @NativeType("GLuint") int texture) {
        GL11C.glBindTexture(target, texture);
    }

    public static native void nglBitmap(int w, int h, float xOrig, float yOrig, float xInc, float yInc, long data);

    public static void glBitmap(@NativeType("GLsizei") int w, @NativeType("GLsizei") int h, @NativeType("GLfloat") float xOrig, @NativeType("GLfloat") float yOrig, @NativeType("GLfloat") float xInc, @NativeType("GLfloat") float yInc, @Nullable @NativeType("GLubyte const *") ByteBuffer data) {
        if (CHECKS) {
            checkSafe(data, ((w + 7) >> 3) * h);
        }
        nglBitmap(w, h, xOrig, yOrig, xInc, yInc, memAddressSafe(data));
    }

    public static void glBitmap(@NativeType("GLsizei") int w, @NativeType("GLsizei") int h, @NativeType("GLfloat") float xOrig, @NativeType("GLfloat") float yOrig, @NativeType("GLfloat") float xInc, @NativeType("GLfloat") float yInc, @Nullable @NativeType("GLubyte const *") long data) {
        nglBitmap(w, h, xOrig, yOrig, xInc, yInc, data);
    }

    public static void glBlendFunc(@NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor) {
        GL11C.glBlendFunc(sfactor, dfactor);
    }

    public static native void glCallList(@NativeType("GLuint") int list);

    public static native void nglCallLists(int n, int type, long lists);

    public static void glCallLists(@NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer lists) {
        nglCallLists(lists.remaining() / GLChecks.typeToBytes(type), type, memAddress(lists));
    }

    public static void glCallLists(@NativeType("void const *") ByteBuffer lists) {
        nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(lists));
    }

    public static void glCallLists(@NativeType("void const *") ShortBuffer lists) {
        nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(lists));
    }

    public static void glCallLists(@NativeType("void const *") IntBuffer lists) {
        nglCallLists(lists.remaining(), GL11.GL_UNSIGNED_INT, memAddress(lists));
    }

    public static void glClear(@NativeType("GLbitfield") int mask) {
        GL11C.glClear(mask);
    }

    public static native void glClearAccum(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha);

    public static void glClearColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha) {
        GL11C.glClearColor(red, green, blue, alpha);
    }

    public static void glClearDepth(@NativeType("GLdouble") double depth) {
        GL11C.glClearDepth(depth);
    }

    public static native void glClearIndex(@NativeType("GLfloat") float index);

    public static void glClearStencil(@NativeType("GLint") int s) {
        GL11C.glClearStencil(s);
    }

    public static native void nglClipPlane(int plane, long equation);

    public static void glClipPlane(@NativeType("GLenum") int plane, @NativeType("GLdouble const *") DoubleBuffer equation) {
        if (CHECKS) {
            check(equation, 4);
        }
        nglClipPlane(plane, memAddress(equation));
    }

    public static native void glColor3b(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue);

    public static native void glColor3s(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue);

    public static native void glColor3i(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue);

    public static native void glColor3f(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue);

    public static native void glColor3d(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue);

    public static native void glColor3ub(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue);

    public static native void glColor3us(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue);

    public static native void glColor3ui(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue);

    public static native void nglColor3bv(long v);

    public static void glColor3bv(@NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3bv(memAddress(v));
    }

    public static native void nglColor3sv(long v);

    public static void glColor3sv(@NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3sv(memAddress(v));
    }

    public static native void nglColor3iv(long v);

    public static void glColor3iv(@NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3iv(memAddress(v));
    }

    public static native void nglColor3fv(long v);

    public static void glColor3fv(@NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3fv(memAddress(v));
    }

    public static native void nglColor3dv(long v);

    public static void glColor3dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3dv(memAddress(v));
    }

    public static native void nglColor3ubv(long v);

    public static void glColor3ubv(@NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3ubv(memAddress(v));
    }

    public static native void nglColor3usv(long v);

    public static void glColor3usv(@NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3usv(memAddress(v));
    }

    public static native void nglColor3uiv(long v);

    public static void glColor3uiv(@NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3uiv(memAddress(v));
    }

    public static native void glColor4b(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue, @NativeType("GLbyte") byte alpha);

    public static native void glColor4s(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue, @NativeType("GLshort") short alpha);

    public static native void glColor4i(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue, @NativeType("GLint") int alpha);

    public static native void glColor4f(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha);

    public static native void glColor4d(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue, @NativeType("GLdouble") double alpha);

    public static native void glColor4ub(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue, @NativeType("GLubyte") byte alpha);

    public static native void glColor4us(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue, @NativeType("GLushort") short alpha);

    public static native void glColor4ui(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue, @NativeType("GLint") int alpha);

    public static native void nglColor4bv(long v);

    public static void glColor4bv(@NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4bv(memAddress(v));
    }

    public static native void nglColor4sv(long v);

    public static void glColor4sv(@NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4sv(memAddress(v));
    }

    public static native void nglColor4iv(long v);

    public static void glColor4iv(@NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4iv(memAddress(v));
    }

    public static native void nglColor4fv(long v);

    public static void glColor4fv(@NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4fv(memAddress(v));
    }

    public static native void nglColor4dv(long v);

    public static void glColor4dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4dv(memAddress(v));
    }

    public static native void nglColor4ubv(long v);

    public static void glColor4ubv(@NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4ubv(memAddress(v));
    }

    public static native void nglColor4usv(long v);

    public static void glColor4usv(@NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4usv(memAddress(v));
    }

    public static native void nglColor4uiv(long v);

    public static void glColor4uiv(@NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4uiv(memAddress(v));
    }

    public static void glColorMask(@NativeType("GLboolean") boolean red, @NativeType("GLboolean") boolean green, @NativeType("GLboolean") boolean blue, @NativeType("GLboolean") boolean alpha) {
        GL11C.glColorMask(red, green, blue, alpha);
    }

    public static native void glColorMaterial(@NativeType("GLenum") int face, @NativeType("GLenum") int mode);

    public static native void nglColorPointer(int size, int type, int stride, long pointer);

    public static void glColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglColorPointer(size, type, stride, memAddress(pointer));
    }

    public static void glColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglColorPointer(size, type, stride, pointer);
    }

    public static void glColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglColorPointer(size, type, stride, memAddress(pointer));
    }

    public static void glColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglColorPointer(size, type, stride, memAddress(pointer));
    }

    public static void glColorPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglColorPointer(size, type, stride, memAddress(pointer));
    }

    public static void glColorPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglColorPointer(size, GL_SHORT, stride, memAddress(pointer));
    }

    public static void glColorPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglColorPointer(size, GL_INT, stride, memAddress(pointer));
    }

    public static void glColorPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglColorPointer(size, GL_FLOAT, stride, memAddress(pointer));
    }

    public static void glColorPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        nglColorPointer(size, GL_DOUBLE, stride, memAddress(pointer));
    }
    
    public static void glColorPointer(@NativeType("GLint") int size, boolean unsigned, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
    	nglColorPointer(size, unsigned ? GL11.GL_UNSIGNED_BYTE : GL11.GL_BYTE, stride, memAddress(pointer));
    }

    public static native void glCopyPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int type);

    public static void glCullFace(@NativeType("GLenum") int mode) {
        GL11C.glCullFace(mode);
    }

    public static native void glDeleteLists(@NativeType("GLuint") int list, @NativeType("GLsizei") int range);

    public static void glDepthFunc(@NativeType("GLenum") int func) {
        GL11C.glDepthFunc(func);
    }

    public static void glDepthMask(@NativeType("GLboolean") boolean flag) {
        GL11C.glDepthMask(flag);
    }

    public static void glDepthRange(@NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar) {
        GL11C.glDepthRange(zNear, zFar);
    }

    public static native void glDisableClientState(@NativeType("GLenum") int cap);

    public static void glDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count) {
        GL11C.glDrawArrays(mode, first, count);
    }

    public static void glDrawBuffer(@NativeType("GLenum") int buf) {
        GL11C.glDrawBuffer(buf);
    }

    public static void nglDrawElements(int mode, int count, int type, long indices) {
        GL11C.nglDrawElements(mode, count, type, indices);
    }

    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices) {
        GL11C.glDrawElements(mode, count, type, indices);
    }

    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices) {
        GL11C.glDrawElements(mode, type, indices);
    }

    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices) {
        GL11C.glDrawElements(mode, indices);
    }

    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices) {
        GL11C.glDrawElements(mode, indices);
    }

    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices) {
        GL11C.glDrawElements(mode, indices);
    }

    public static native void nglDrawPixels(int width, int height, int format, int type, long pixels);

    public static void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglDrawPixels(width, height, format, type, memAddress(pixels));
    }

    public static void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglDrawPixels(width, height, format, type, pixels);
    }

    public static void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglDrawPixels(width, height, format, type, memAddress(pixels));
    }

    public static void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglDrawPixels(width, height, format, type, memAddress(pixels));
    }

    public static void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglDrawPixels(width, height, format, type, memAddress(pixels));
    }

    public static native void glEdgeFlag(@NativeType("GLboolean") boolean flag);

    public static native void nglEdgeFlagv(long flag);

    public static void glEdgeFlagv(@NativeType("GLboolean const *") ByteBuffer flag) {
        if (CHECKS) {
            check(flag, 1);
        }
        nglEdgeFlagv(memAddress(flag));
    }

    public static native void nglEdgeFlagPointer(int stride, long pointer);

    public static void glEdgeFlagPointer(@NativeType("GLsizei") int stride, @NativeType("GLboolean const *") ByteBuffer pointer) {
        nglEdgeFlagPointer(stride, memAddress(pointer));
    }

    public static void glEdgeFlagPointer(@NativeType("GLsizei") int stride, @NativeType("GLboolean const *") long pointer) {
        nglEdgeFlagPointer(stride, pointer);
    }

    public static native void glEnableClientState(@NativeType("GLenum") int cap);

    public static native void glEnd();

    public static native void glEvalCoord1f(@NativeType("GLfloat") float u);

    public static native void nglEvalCoord1fv(long u);

    public static void glEvalCoord1fv(@NativeType("GLfloat const *") FloatBuffer u) {
        if (CHECKS) {
            check(u, 1);
        }
        nglEvalCoord1fv(memAddress(u));
    }

    public static native void glEvalCoord1d(@NativeType("GLdouble") double u);

    public static native void nglEvalCoord1dv(long u);

    public static void glEvalCoord1dv(@NativeType("GLdouble const *") DoubleBuffer u) {
        if (CHECKS) {
            check(u, 1);
        }
        nglEvalCoord1dv(memAddress(u));
    }

    public static native void glEvalCoord2f(@NativeType("GLfloat") float u, @NativeType("GLfloat") float v);

    public static native void nglEvalCoord2fv(long u);

    public static void glEvalCoord2fv(@NativeType("GLfloat const *") FloatBuffer u) {
        if (CHECKS) {
            check(u, 2);
        }
        nglEvalCoord2fv(memAddress(u));
    }

    public static native void glEvalCoord2d(@NativeType("GLdouble") double u, @NativeType("GLdouble") double v);

    public static native void nglEvalCoord2dv(long u);

    public static void glEvalCoord2dv(@NativeType("GLdouble const *") DoubleBuffer u) {
        if (CHECKS) {
            check(u, 2);
        }
        nglEvalCoord2dv(memAddress(u));
    }

    public static native void glEvalMesh1(@NativeType("GLenum") int mode, @NativeType("GLint") int i1, @NativeType("GLint") int i2);

    public static native void glEvalMesh2(@NativeType("GLenum") int mode, @NativeType("GLint") int i1, @NativeType("GLint") int i2, @NativeType("GLint") int j1, @NativeType("GLint") int j2);

    public static native void glEvalPoint1(@NativeType("GLint") int i);

    public static native void glEvalPoint2(@NativeType("GLint") int i, @NativeType("GLint") int j);

    public static native void nglFeedbackBuffer(int size, int type, long buffer);

    public static void glFeedbackBuffer(@NativeType("GLenum") int type, @NativeType("GLfloat *") FloatBuffer buffer) {
        nglFeedbackBuffer(buffer.remaining(), type, memAddress(buffer));
    }

    public static void glFinish() {
        GL11C.glFinish();
    }

    public static void glFlush() {
        GL11C.glFlush();
    }

    public static native void glFogi(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

    public static native void nglFogiv(int pname, long params);

    public static void glFogiv(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglFogiv(pname, memAddress(params));
    }

    public static native void glFogf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    public static native void nglFogfv(int pname, long params);

    public static void glFog(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
    	glFogfv(pname, params);
    }

    public static void glFogfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglFogfv(pname, memAddress(params));
    }

    public static void glFrontFace(@NativeType("GLenum") int dir) {
        GL11C.glFrontFace(dir);
    }

    @NativeType("GLuint")
    public static native int glGenLists(@NativeType("GLsizei") int s);

    public static void nglGenTextures(int n, long textures) {
        GL11C.nglGenTextures(n, textures);
    }

    public static void glGenTextures(@NativeType("GLuint *") IntBuffer textures) {
        GL11C.glGenTextures(textures);
    }

    @NativeType("void")
    public static int glGenTextures() {
        return GL11C.glGenTextures();
    }

    public static void nglDeleteTextures(int n, long textures) {
        GL11C.nglDeleteTextures(n, textures);
    }

    public static void glDeleteTextures(@NativeType("GLuint const *") IntBuffer textures) {
        GL11C.glDeleteTextures(textures);
    }

    public static void glDeleteTextures(@NativeType("GLuint const *") int texture) {
        GL11C.glDeleteTextures(texture);
    }

    public static native void nglGetClipPlane(int plane, long equation);

    public static void glGetClipPlane(@NativeType("GLenum") int plane, @NativeType("GLdouble *") DoubleBuffer equation) {
        if (CHECKS) {
            check(equation, 4);
        }
        nglGetClipPlane(plane, memAddress(equation));
    }

    public static void nglGetBooleanv(int pname, long params) {
        GL11C.nglGetBooleanv(pname, params);
    }

    public static void glGetBoolean(@NativeType("GLenum") int pname, @NativeType("GLboolean *") ByteBuffer params) {
        GL11C.glGetBooleanv(pname, params);
    }

    public static void glGetBooleanv(@NativeType("GLenum") int pname, @NativeType("GLboolean *") ByteBuffer params) {
        GL11C.glGetBooleanv(pname, params);
    }

    @NativeType("void")
    public static boolean glGetBoolean(@NativeType("GLenum") int pname) {
        return GL11C.glGetBoolean(pname);
    }

    public static void nglGetFloatv(int pname, long params) {
        GL11C.nglGetFloatv(pname, params);
    }

    public static void glGetFloat(@NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL11C.glGetFloatv(pname, params);
    }

    public static void glGetFloatv(@NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL11C.glGetFloatv(pname, params);
    }

    @NativeType("void")
    public static float glGetFloat(@NativeType("GLenum") int pname) {
        return GL11C.glGetFloat(pname);
    }

    public static void nglGetIntegerv(int pname, long params) {
        GL11C.nglGetIntegerv(pname, params);
    }

    public static void glGetInteger(@NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL11C.glGetIntegerv(pname, params);
    }

    public static void glGetIntegerv(@NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL11C.glGetIntegerv(pname, params);
    }

    @NativeType("void")
    public static int glGetInteger(@NativeType("GLenum") int pname) {
        return GL11C.glGetInteger(pname);
    }

    public static void nglGetDoublev(int pname, long params) {
        GL11C.nglGetDoublev(pname, params);
    }

    public static void glGetDouble(@NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        GL11C.glGetDoublev(pname, params);
    }

    public static void glGetDoublev(@NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        GL11C.glGetDoublev(pname, params);
    }

    @NativeType("void")
    public static double glGetDouble(@NativeType("GLenum") int pname) {
        return GL11C.glGetDouble(pname);
    }

    @NativeType("GLenum")
    public static int glGetError() {
        return GL11C.glGetError();
    }

    public static native void nglGetLightiv(int light, int pname, long data);

    public static void glGetLightiv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 4);
        }
        nglGetLightiv(light, pname, memAddress(data));
    }

    @NativeType("void")
    public static int glGetLighti(@NativeType("GLenum") int light, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetLightiv(light, pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nglGetLightfv(int light, int pname, long data);

    public static void glGetLightfv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 4);
        }
        nglGetLightfv(light, pname, memAddress(data));
    }

    @NativeType("void")
    public static float glGetLightf(@NativeType("GLenum") int light, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetLightfv(light, pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nglGetMapiv(int target, int query, long data);

    public static void glGetMapiv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 4);
        }
        nglGetMapiv(target, query, memAddress(data));
    }

    @NativeType("void")
    public static int glGetMapi(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetMapiv(target, query, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nglGetMapfv(int target, int query, long data);

    public static void glGetMapfv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 4);
        }
        nglGetMapfv(target, query, memAddress(data));
    }

    @NativeType("void")
    public static float glGetMapf(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetMapfv(target, query, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nglGetMapdv(int target, int query, long data);

    public static void glGetMapdv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") DoubleBuffer data) {
        if (CHECKS) {
            check(data, 4);
        }
        nglGetMapdv(target, query, memAddress(data));
    }

    @NativeType("void")
    public static double glGetMapd(@NativeType("GLenum") int target, @NativeType("GLenum") int query) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer data = stack.callocDouble(1);
            nglGetMapdv(target, query, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nglGetMaterialiv(int face, int pname, long data);

    public static void glGetMaterialiv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetMaterialiv(face, pname, memAddress(data));
    }

    public static native void nglGetMaterialfv(int face, int pname, long data);

    public static void glGetMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetMaterialfv(face, pname, memAddress(data));
    }

    public static native void nglGetPixelMapfv(int map, long data);

    public static void glGetPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 32);
        }
        nglGetPixelMapfv(map, memAddress(data));
    }

    public static void glGetPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat *") long data) {
        nglGetPixelMapfv(map, data);
    }

    public static native void nglGetPixelMapusv(int map, long data);

    public static void glGetPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") ShortBuffer data) {
        if (CHECKS) {
            check(data, 32);
        }
        nglGetPixelMapusv(map, memAddress(data));
    }

    public static void glGetPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") long data) {
        nglGetPixelMapusv(map, data);
    }

    public static native void nglGetPixelMapuiv(int map, long data);

    public static void glGetPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 32);
        }
        nglGetPixelMapuiv(map, memAddress(data));
    }

    public static void glGetPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") long data) {
        nglGetPixelMapuiv(map, data);
    }

    public static void nglGetPointerv(int pname, long params) {
        GL11C.nglGetPointerv(pname, params);
    }

    public static void glGetPointerv(@NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        GL11C.glGetPointerv(pname, params);
    }

    @NativeType("void")
    public static long glGetPointer(@NativeType("GLenum") int pname) {
        return GL11C.glGetPointer(pname);
    }

    public static native void nglGetPolygonStipple(long pattern);

    public static void glGetPolygonStipple(@NativeType("void *") ByteBuffer pattern) {
        if (CHECKS) {
            check(pattern, 128);
        }
        nglGetPolygonStipple(memAddress(pattern));
    }

    public static void glGetPolygonStipple(@NativeType("void *") long pattern) {
        nglGetPolygonStipple(pattern);
    }

    public static long nglGetString(int name) {
        return GL11C.nglGetString(name);
    }

    @Nullable
    @NativeType("GLubyte const *")
    public static String glGetString(@NativeType("GLenum") int name) {
        return GL11C.glGetString(name);
    }

    public static native void nglGetTexEnviv(int env, int pname, long data);

    public static void glGetTexEnviv(@NativeType("GLenum") int env, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetTexEnviv(env, pname, memAddress(data));
    }

    @NativeType("void")
    public static int glGetTexEnvi(@NativeType("GLenum") int env, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetTexEnviv(env, pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nglGetTexEnvfv(int env, int pname, long data);

    public static void glGetTexEnvfv(@NativeType("GLenum") int env, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetTexEnvfv(env, pname, memAddress(data));
    }

    @NativeType("void")
    public static float glGetTexEnvf(@NativeType("GLenum") int env, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetTexEnvfv(env, pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nglGetTexGeniv(int coord, int pname, long data);

    public static void glGetTexGeniv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetTexGeniv(coord, pname, memAddress(data));
    }

    @NativeType("void")
    public static int glGetTexGeni(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetTexGeniv(coord, pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nglGetTexGenfv(int coord, int pname, long data);

    public static void glGetTexGenfv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 4);
        }
        nglGetTexGenfv(coord, pname, memAddress(data));
    }

    @NativeType("void")
    public static float glGetTexGenf(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetTexGenfv(coord, pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nglGetTexGendv(int coord, int pname, long data);

    public static void glGetTexGendv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer data) {
        if (CHECKS) {
            check(data, 4);
        }
        nglGetTexGendv(coord, pname, memAddress(data));
    }

    @NativeType("void")
    public static double glGetTexGend(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer data = stack.callocDouble(1);
            nglGetTexGendv(coord, pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void nglGetTexImage(int tex, int level, int format, int type, long pixels) {
        GL11C.nglGetTexImage(tex, level, format, type, pixels);
    }

    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    public static void nglGetTexLevelParameteriv(int target, int level, int pname, long params) {
        GL11C.nglGetTexLevelParameteriv(target, level, pname, params);
    }

    public static void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL11C.glGetTexLevelParameteriv(target, level, pname, params);
    }

    @NativeType("void")
    public static int glGetTexLevelParameteri(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return GL11C.glGetTexLevelParameteri(target, level, pname);
    }

    public static void nglGetTexLevelParameterfv(int target, int level, int pname, long params) {
        GL11C.nglGetTexLevelParameterfv(target, level, pname, params);
    }

    public static void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL11C.glGetTexLevelParameterfv(target, level, pname, params);
    }

    @NativeType("void")
    public static float glGetTexLevelParameterf(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return GL11C.glGetTexLevelParameterf(target, level, pname);
    }

    public static void nglGetTexParameteriv(int target, int pname, long params) {
        GL11C.nglGetTexParameteriv(target, pname, params);
    }

    public static void glGetTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL11C.glGetTexParameteriv(target, pname, params);
    }

    @NativeType("void")
    public static int glGetTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL11C.glGetTexParameteri(target, pname);
    }

    public static void nglGetTexParameterfv(int target, int pname, long params) {
        GL11C.nglGetTexParameterfv(target, pname, params);
    }

    public static void glGetTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL11C.glGetTexParameterfv(target, pname, params);
    }

    @NativeType("void")
    public static float glGetTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL11C.glGetTexParameterf(target, pname);
    }

    public static void glHint(@NativeType("GLenum") int target, @NativeType("GLenum") int hint) {
        GL11C.glHint(target, hint);
    }

    public static native void glIndexi(@NativeType("GLint") int index);

    public static native void glIndexub(@NativeType("GLubyte") byte index);

    public static native void glIndexs(@NativeType("GLshort") short index);

    public static native void glIndexf(@NativeType("GLfloat") float index);

    public static native void glIndexd(@NativeType("GLdouble") double index);

    public static native void nglIndexiv(long index);

    public static void glIndexiv(@NativeType("GLint const *") IntBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        nglIndexiv(memAddress(index));
    }

    public static native void nglIndexubv(long index);

    public static void glIndexubv(@NativeType("GLubyte const *") ByteBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        nglIndexubv(memAddress(index));
    }

    public static native void nglIndexsv(long index);

    public static void glIndexsv(@NativeType("GLshort const *") ShortBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        nglIndexsv(memAddress(index));
    }

    public static native void nglIndexfv(long index);

    public static void glIndexfv(@NativeType("GLfloat const *") FloatBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        nglIndexfv(memAddress(index));
    }

    public static native void nglIndexdv(long index);

    public static void glIndexdv(@NativeType("GLdouble const *") DoubleBuffer index) {
        if (CHECKS) {
            check(index, 1);
        }
        nglIndexdv(memAddress(index));
    }

    public static native void glIndexMask(@NativeType("GLuint") int mask);

    public static native void nglIndexPointer(int type, int stride, long pointer);

    public static void glIndexPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglIndexPointer(type, stride, memAddress(pointer));
    }

    public static void glIndexPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglIndexPointer(type, stride, pointer);
    }

    public static void glIndexPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglIndexPointer(GL11.GL_UNSIGNED_BYTE, stride, memAddress(pointer));
    }

    public static void glIndexPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglIndexPointer(GL11.GL_SHORT, stride, memAddress(pointer));
    }

    public static void glIndexPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglIndexPointer(GL11.GL_INT, stride, memAddress(pointer));
    }

    public static native void glInitNames();

    public static native void nglInterleavedArrays(int format, int stride, long pointer);

    public static void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglInterleavedArrays(format, stride, memAddress(pointer));
    }

    public static void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglInterleavedArrays(format, stride, pointer);
    }

    public static void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglInterleavedArrays(format, stride, memAddress(pointer));
    }

    public static void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglInterleavedArrays(format, stride, memAddress(pointer));
    }

    public static void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglInterleavedArrays(format, stride, memAddress(pointer));
    }

    public static void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        nglInterleavedArrays(format, stride, memAddress(pointer));
    }

    @NativeType("GLboolean")
    public static boolean glIsEnabled(@NativeType("GLenum") int cap) {
        return GL11C.glIsEnabled(cap);
    }

    @NativeType("GLboolean")
    public static native boolean glIsList(@NativeType("GLuint") int list);

    @NativeType("GLboolean")
    public static boolean glIsTexture(@NativeType("GLuint") int texture) {
        return GL11C.glIsTexture(texture);
    }

    public static native void glLightModeli(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

    public static native void glLightModelf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    public static native void nglLightModeliv(int pname, long params);

    public static void glLightModeliv(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglLightModeliv(pname, memAddress(params));
    }

    public static native void nglLightModelfv(int pname, long params);

    public static void glLightModel(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
    	glLightModelfv(pname, params);
    }

    public static void glLightModelfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglLightModelfv(pname, memAddress(params));
    }

    public static native void glLighti(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    public static native void glLightf(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    public static native void nglLightiv(int light, int pname, long params);

    public static void glLightiv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglLightiv(light, pname, memAddress(params));
    }

    public static native void nglLightfv(int light, int pname, long params);

    public static void glLight(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        glLightfv(light, pname, params);
    }

    public static void glLightfv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglLightfv(light, pname, memAddress(params));
    }

    public static native void glLineStipple(@NativeType("GLint") int factor, @NativeType("GLushort") short pattern);

    public static void glLineWidth(@NativeType("GLfloat") float width) {
        GL11C.glLineWidth(width);
    }

    public static native void glListBase(@NativeType("GLuint") int base);

    public static native void nglLoadMatrixf(long m);

    public static void glLoadMatrixf(@NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglLoadMatrixf(memAddress(m));
    }

    public static native void nglLoadMatrixd(long m);

    public static void glLoadMatrixd(@NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglLoadMatrixd(memAddress(m));
    }

    public static native void glLoadIdentity();

    public static native void glLoadName(@NativeType("GLuint") int name);

    public static void glLogicOp(@NativeType("GLenum") int op) {
        GL11C.glLogicOp(op);
    }

    public static native void nglMap1f(int target, float u1, float u2, int stride, int order, long points);

    public static void glMap1f(@NativeType("GLenum") int target, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLfloat const *") FloatBuffer points) {
        if (CHECKS) {
            check(points, order * stride);
        }
        nglMap1f(target, u1, u2, stride, order, memAddress(points));
    }

    public static native void nglMap1d(int target, double u1, double u2, int stride, int order, long points);

    public static void glMap1d(@NativeType("GLenum") int target, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLdouble const *") DoubleBuffer points) {
        if (CHECKS) {
            check(points, stride * order);
        }
        nglMap1d(target, u1, u2, stride, order, memAddress(points));
    }

    public static native void nglMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, long points);

    public static void glMap2f(@NativeType("GLenum") int target, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLfloat const *") FloatBuffer points) {
        if (CHECKS) {
            check(points, ustride * uorder * vstride * vorder);
        }
        nglMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points));
    }

    public static native void nglMap2d(int target, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, long points);

    public static void glMap2d(@NativeType("GLenum") int target, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLdouble const *") DoubleBuffer points) {
        if (CHECKS) {
            check(points, ustride * uorder * vstride * vorder);
        }
        nglMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, memAddress(points));
    }

    public static native void glMapGrid1f(@NativeType("GLint") int n, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2);

    public static native void glMapGrid1d(@NativeType("GLint") int n, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2);

    public static native void glMapGrid2f(@NativeType("GLint") int un, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int vn, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    public static native void glMapGrid2d(@NativeType("GLint") int un, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int vn, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2);

    public static native void glMateriali(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    public static native void glMaterialf(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    public static native void nglMaterialiv(int face, int pname, long params);

    public static void glMaterialiv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMaterialiv(face, pname, memAddress(params));
    }

    public static native void nglMaterialfv(int face, int pname, long params);

    public static void glMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglMaterialfv(face, pname, memAddress(params));
    }

    public static native void glMatrixMode(@NativeType("GLenum") int mode);

    public static native void nglMultMatrixf(long m);

    public static void glMultMatrixf(@NativeType("GLfloat const *") FloatBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMultMatrixf(memAddress(m));
    }

    public static native void nglMultMatrixd(long m);

    public static void glMultMatrixd(@NativeType("GLdouble const *") DoubleBuffer m) {
        if (CHECKS) {
            check(m, 16);
        }
        nglMultMatrixd(memAddress(m));
    }

    public static native void glFrustum(@NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f);

    public static native void glNewList(@NativeType("GLuint") int n, @NativeType("GLenum") int mode);

    public static native void glEndList();

    public static native void glNormal3f(@NativeType("GLfloat") float nx, @NativeType("GLfloat") float ny, @NativeType("GLfloat") float nz);

    public static native void glNormal3b(@NativeType("GLbyte") byte nx, @NativeType("GLbyte") byte ny, @NativeType("GLbyte") byte nz);

    public static native void glNormal3s(@NativeType("GLshort") short nx, @NativeType("GLshort") short ny, @NativeType("GLshort") short nz);

    public static native void glNormal3i(@NativeType("GLint") int nx, @NativeType("GLint") int ny, @NativeType("GLint") int nz);

    public static native void glNormal3d(@NativeType("GLdouble") double nx, @NativeType("GLdouble") double ny, @NativeType("GLdouble") double nz);

    public static native void nglNormal3fv(long v);

    public static void glNormal3fv(@NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglNormal3fv(memAddress(v));
    }

    public static native void nglNormal3bv(long v);

    public static void glNormal3bv(@NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglNormal3bv(memAddress(v));
    }

    public static native void nglNormal3sv(long v);

    public static void glNormal3sv(@NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglNormal3sv(memAddress(v));
    }

    public static native void nglNormal3iv(long v);

    public static void glNormal3iv(@NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglNormal3iv(memAddress(v));
    }

    public static native void nglNormal3dv(long v);

    public static void glNormal3dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglNormal3dv(memAddress(v));
    }

    public static native void nglNormalPointer(int type, int stride, long pointer);

    public static void glNormalPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglNormalPointer(type, stride, memAddress(pointer));
    }

    public static void glNormalPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglNormalPointer(type, stride, pointer);
    }

    public static void glNormalPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglNormalPointer(type, stride, memAddress(pointer));
    }

    public static void glNormalPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglNormalPointer(type, stride, memAddress(pointer));
    }

    public static void glNormalPointer(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglNormalPointer(type, stride, memAddress(pointer));
    }

    public static void glNormalPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglNormalPointer(GL_BYTE, stride, memAddress(pointer));
    }

    public static void glNormalPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglNormalPointer(GL_SHORT, stride, memAddress(pointer));
    }

    public static void glNormalPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglNormalPointer(GL_INT, stride, memAddress(pointer));
    }

    public static void glNormalPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglNormalPointer(GL_FLOAT, stride, memAddress(pointer));
    }

    public static void glNormalPointer(@NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        nglNormalPointer(GL_DOUBLE, stride, memAddress(pointer));
    }

    public static native void glOrtho(@NativeType("GLdouble") double l, @NativeType("GLdouble") double r, @NativeType("GLdouble") double b, @NativeType("GLdouble") double t, @NativeType("GLdouble") double n, @NativeType("GLdouble") double f);

    public static native void glPassThrough(@NativeType("GLfloat") float token);

    public static native void nglPixelMapfv(int map, int size, long values);

    public static void glPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLsizei") int size, @NativeType("GLfloat const *") long values) {
        nglPixelMapfv(map, size, values);
    }

    public static void glPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat const *") FloatBuffer values) {
        nglPixelMapfv(map, values.remaining(), memAddress(values));
    }

    public static native void nglPixelMapusv(int map, int size, long values);

    public static void glPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLsizei") int size, @NativeType("GLushort const *") long values) {
        nglPixelMapusv(map, size, values);
    }

    public static void glPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort const *") ShortBuffer values) {
        nglPixelMapusv(map, values.remaining(), memAddress(values));
    }

    public static native void nglPixelMapuiv(int map, int size, long values);

    public static void glPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLsizei") int size, @NativeType("GLuint const *") long values) {
        nglPixelMapuiv(map, size, values);
    }

    public static void glPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint const *") IntBuffer values) {
        nglPixelMapuiv(map, values.remaining(), memAddress(values));
    }

    public static void glPixelStorei(@NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL11C.glPixelStorei(pname, param);
    }

    public static void glPixelStoref(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        GL11C.glPixelStoref(pname, param);
    }

    public static native void glPixelTransferi(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

    public static native void glPixelTransferf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    public static native void glPixelZoom(@NativeType("GLfloat") float xfactor, @NativeType("GLfloat") float yfactor);

    public static void glPointSize(@NativeType("GLfloat") float size) {
        GL11C.glPointSize(size);
    }

    public static void glPolygonMode(@NativeType("GLenum") int face, @NativeType("GLenum") int mode) {
        GL11C.glPolygonMode(face, mode);
    }

    public static void glPolygonOffset(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units) {
        GL11C.glPolygonOffset(factor, units);
    }

    public static native void nglPolygonStipple(long pattern);

    public static void glPolygonStipple(@NativeType("GLubyte const *") ByteBuffer pattern) {
        if (CHECKS) {
            check(pattern, 128);
        }
        nglPolygonStipple(memAddress(pattern));
    }

    public static void glPolygonStipple(@NativeType("GLubyte const *") long pattern) {
        nglPolygonStipple(pattern);
    }

    public static native void glPushAttrib(@NativeType("GLbitfield") int mask);

    public static native void glPushClientAttrib(@NativeType("GLbitfield") int mask);

    public static native void glPopAttrib();

    public static native void glPopClientAttrib();

    public static native void glPopMatrix();

    public static native void glPopName();

    public static native void nglPrioritizeTextures(int n, long textures, long priorities);

    public static void glPrioritizeTextures(@NativeType("GLuint const *") IntBuffer textures, @NativeType("GLfloat const *") FloatBuffer priorities) {
        if (CHECKS) {
            check(priorities, textures.remaining());
        }
        nglPrioritizeTextures(textures.remaining(), memAddress(textures), memAddress(priorities));
    }

    public static native void glPushMatrix();

    public static native void glPushName(@NativeType("GLuint") int name);

    public static native void glRasterPos2i(@NativeType("GLint") int x, @NativeType("GLint") int y);

    public static native void glRasterPos2s(@NativeType("GLshort") short x, @NativeType("GLshort") short y);

    public static native void glRasterPos2f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    public static native void glRasterPos2d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    public static native void nglRasterPos2iv(long coords);

    public static void glRasterPos2iv(@NativeType("GLint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 2);
        }
        nglRasterPos2iv(memAddress(coords));
    }

    public static native void nglRasterPos2sv(long coords);

    public static void glRasterPos2sv(@NativeType("GLshort const *") ShortBuffer coords) {
        if (CHECKS) {
            check(coords, 2);
        }
        nglRasterPos2sv(memAddress(coords));
    }

    public static native void nglRasterPos2fv(long coords);

    public static void glRasterPos2fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        if (CHECKS) {
            check(coords, 2);
        }
        nglRasterPos2fv(memAddress(coords));
    }

    public static native void nglRasterPos2dv(long coords);

    public static void glRasterPos2dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        if (CHECKS) {
            check(coords, 2);
        }
        nglRasterPos2dv(memAddress(coords));
    }

    public static native void glRasterPos3i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    public static native void glRasterPos3s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z);

    public static native void glRasterPos3f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    public static native void glRasterPos3d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    public static native void nglRasterPos3iv(long coords);

    public static void glRasterPos3iv(@NativeType("GLint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 3);
        }
        nglRasterPos3iv(memAddress(coords));
    }

    public static native void nglRasterPos3sv(long coords);

    public static void glRasterPos3sv(@NativeType("GLshort const *") ShortBuffer coords) {
        if (CHECKS) {
            check(coords, 3);
        }
        nglRasterPos3sv(memAddress(coords));
    }

    public static native void nglRasterPos3fv(long coords);

    public static void glRasterPos3fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        if (CHECKS) {
            check(coords, 3);
        }
        nglRasterPos3fv(memAddress(coords));
    }

    public static native void nglRasterPos3dv(long coords);

    public static void glRasterPos3dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        if (CHECKS) {
            check(coords, 3);
        }
        nglRasterPos3dv(memAddress(coords));
    }

    public static native void glRasterPos4i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    public static native void glRasterPos4s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z, @NativeType("GLshort") short w);

    public static native void glRasterPos4f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w);

    public static native void glRasterPos4d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    public static native void nglRasterPos4iv(long coords);

    public static void glRasterPos4iv(@NativeType("GLint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 4);
        }
        nglRasterPos4iv(memAddress(coords));
    }

    public static native void nglRasterPos4sv(long coords);

    public static void glRasterPos4sv(@NativeType("GLshort const *") ShortBuffer coords) {
        if (CHECKS) {
            check(coords, 4);
        }
        nglRasterPos4sv(memAddress(coords));
    }

    public static native void nglRasterPos4fv(long coords);

    public static void glRasterPos4fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        if (CHECKS) {
            check(coords, 4);
        }
        nglRasterPos4fv(memAddress(coords));
    }

    public static native void nglRasterPos4dv(long coords);

    public static void glRasterPos4dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        if (CHECKS) {
            check(coords, 4);
        }
        nglRasterPos4dv(memAddress(coords));
    }

    public static void glReadBuffer(@NativeType("GLenum") int src) {
        GL11C.glReadBuffer(src);
    }

    public static void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels) {
        GL11C.nglReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static native void glRecti(@NativeType("GLint") int x1, @NativeType("GLint") int y1, @NativeType("GLint") int x2, @NativeType("GLint") int y2);

    public static native void glRects(@NativeType("GLshort") short x1, @NativeType("GLshort") short y1, @NativeType("GLshort") short x2, @NativeType("GLshort") short y2);

    public static native void glRectf(@NativeType("GLfloat") float x1, @NativeType("GLfloat") float y1, @NativeType("GLfloat") float x2, @NativeType("GLfloat") float y2);

    public static native void glRectd(@NativeType("GLdouble") double x1, @NativeType("GLdouble") double y1, @NativeType("GLdouble") double x2, @NativeType("GLdouble") double y2);

    public static native void nglRectiv(long v1, long v2);

    public static void glRectiv(@NativeType("GLint const *") IntBuffer v1, @NativeType("GLint const *") IntBuffer v2) {
        if (CHECKS) {
            check(v1, 2);
            check(v2, 2);
        }
        nglRectiv(memAddress(v1), memAddress(v2));
    }

    public static native void nglRectsv(long v1, long v2);

    public static void glRectsv(@NativeType("GLshort const *") ShortBuffer v1, @NativeType("GLshort const *") ShortBuffer v2) {
        if (CHECKS) {
            check(v1, 2);
            check(v2, 2);
        }
        nglRectsv(memAddress(v1), memAddress(v2));
    }

    public static native void nglRectfv(long v1, long v2);

    public static void glRectfv(@NativeType("GLfloat const *") FloatBuffer v1, @NativeType("GLfloat const *") FloatBuffer v2) {
        if (CHECKS) {
            check(v1, 2);
            check(v2, 2);
        }
        nglRectfv(memAddress(v1), memAddress(v2));
    }

    public static native void nglRectdv(long v1, long v2);

    public static void glRectdv(@NativeType("GLdouble const *") DoubleBuffer v1, @NativeType("GLdouble const *") DoubleBuffer v2) {
        if (CHECKS) {
            check(v1, 2);
            check(v2, 2);
        }
        nglRectdv(memAddress(v1), memAddress(v2));
    }

    @NativeType("GLint")
    public static native int glRenderMode(@NativeType("GLenum") int mode);

    public static native void glRotatef(@NativeType("GLfloat") float angle, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    public static native void glRotated(@NativeType("GLdouble") double angle, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    public static native void glScalef(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    public static native void glScaled(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    public static void glScissor(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL11C.glScissor(x, y, width, height);
    }

    public static native void nglSelectBuffer(int size, long buffer);

    public static void glSelectBuffer(@NativeType("GLuint *") IntBuffer buffer) {
        nglSelectBuffer(buffer.remaining(), memAddress(buffer));
    }

    public static native void glShadeModel(@NativeType("GLenum") int mode);

    public static void glStencilFunc(@NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask) {
        GL11C.glStencilFunc(func, ref, mask);
    }

    public static void glStencilMask(@NativeType("GLuint") int mask) {
        GL11C.glStencilMask(mask);
    }

    public static void glStencilOp(@NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass) {
        GL11C.glStencilOp(sfail, dpfail, dppass);
    }

    public static native void glTexCoord1f(@NativeType("GLfloat") float s);

    public static native void glTexCoord1s(@NativeType("GLshort") short s);

    public static native void glTexCoord1i(@NativeType("GLint") int s);

    public static native void glTexCoord1d(@NativeType("GLdouble") double s);

    public static native void nglTexCoord1fv(long v);

    public static void glTexCoord1fv(@NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglTexCoord1fv(memAddress(v));
    }

    public static native void nglTexCoord1sv(long v);

    public static void glTexCoord1sv(@NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglTexCoord1sv(memAddress(v));
    }

    public static native void nglTexCoord1iv(long v);

    public static void glTexCoord1iv(@NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglTexCoord1iv(memAddress(v));
    }

    public static native void nglTexCoord1dv(long v);

    public static void glTexCoord1dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglTexCoord1dv(memAddress(v));
    }

    public static native void glTexCoord2f(@NativeType("GLfloat") float s, @NativeType("GLfloat") float t);

    public static native void glTexCoord2s(@NativeType("GLshort") short s, @NativeType("GLshort") short t);

    public static native void glTexCoord2i(@NativeType("GLint") int s, @NativeType("GLint") int t);

    public static native void glTexCoord2d(@NativeType("GLdouble") double s, @NativeType("GLdouble") double t);

    public static native void nglTexCoord2fv(long v);

    public static void glTexCoord2fv(@NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglTexCoord2fv(memAddress(v));
    }

    public static native void nglTexCoord2sv(long v);

    public static void glTexCoord2sv(@NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglTexCoord2sv(memAddress(v));
    }

    public static native void nglTexCoord2iv(long v);

    public static void glTexCoord2iv(@NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglTexCoord2iv(memAddress(v));
    }

    public static native void nglTexCoord2dv(long v);

    public static void glTexCoord2dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglTexCoord2dv(memAddress(v));
    }

    public static native void glTexCoord3f(@NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r);

    public static native void glTexCoord3s(@NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r);

    public static native void glTexCoord3i(@NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r);

    public static native void glTexCoord3d(@NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r);

    public static native void nglTexCoord3fv(long v);

    public static void glTexCoord3fv(@NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglTexCoord3fv(memAddress(v));
    }

    public static native void nglTexCoord3sv(long v);

    public static void glTexCoord3sv(@NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglTexCoord3sv(memAddress(v));
    }

    public static native void nglTexCoord3iv(long v);

    public static void glTexCoord3iv(@NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglTexCoord3iv(memAddress(v));
    }

    public static native void nglTexCoord3dv(long v);

    public static void glTexCoord3dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglTexCoord3dv(memAddress(v));
    }

    public static native void glTexCoord4f(@NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r, @NativeType("GLfloat") float q);

    public static native void glTexCoord4s(@NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r, @NativeType("GLshort") short q);

    public static native void glTexCoord4i(@NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r, @NativeType("GLint") int q);

    public static native void glTexCoord4d(@NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r, @NativeType("GLdouble") double q);

    public static native void nglTexCoord4fv(long v);

    public static void glTexCoord4fv(@NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglTexCoord4fv(memAddress(v));
    }

    public static native void nglTexCoord4sv(long v);

    public static void glTexCoord4sv(@NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglTexCoord4sv(memAddress(v));
    }

    public static native void nglTexCoord4iv(long v);

    public static void glTexCoord4iv(@NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglTexCoord4iv(memAddress(v));
    }

    public static native void nglTexCoord4dv(long v);

    public static void glTexCoord4dv(@NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglTexCoord4dv(memAddress(v));
    }

    public static native void nglTexCoordPointer(int size, int type, int stride, long pointer);

    public static void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglTexCoordPointer(size, type, stride, memAddress(pointer));
    }

    public static void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglTexCoordPointer(size, type, stride, pointer);
    }

    public static void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglTexCoordPointer(size, type, stride, memAddress(pointer));
    }

    public static void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglTexCoordPointer(size, type, stride, memAddress(pointer));
    }

    public static void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglTexCoordPointer(size, type, stride, memAddress(pointer));
    }

    public static void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglTexCoordPointer(size, GL_SHORT, stride, memAddress(pointer));
    }

    public static void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglTexCoordPointer(size, GL_INT, stride, memAddress(pointer));
    }

    public static void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglTexCoordPointer(size, GL_FLOAT, stride, memAddress(pointer));
    }

    public static void glTexCoordPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        nglTexCoordPointer(size, GL_DOUBLE, stride, memAddress(pointer));
    }

    public static native void glTexEnvi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    public static native void nglTexEnviv(int target, int pname, long params);

    public static void glTexEnviv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTexEnviv(target, pname, memAddress(params));
    }

    public static native void glTexEnvf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    public static native void nglTexEnvfv(int target, int pname, long params);

    public static void glTexEnvfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTexEnvfv(target, pname, memAddress(params));
    }

    public static native void glTexGeni(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    public static native void nglTexGeniv(int coord, int pname, long params);

    public static void glTexGeniv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTexGeniv(coord, pname, memAddress(params));
    }

    public static native void glTexGenf(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    public static native void nglTexGenfv(int coord, int pname, long params);

    public static void glTexGenfv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTexGenfv(coord, pname, memAddress(params));
    }

    public static native void glTexGend(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble") double param);

    public static native void nglTexGendv(int coord, int pname, long params);

    public static void glTexGendv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble const *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTexGendv(coord, pname, memAddress(params));
    }

    public static void nglTexImage1D(int target, int level, int internalformat, int width, int border, int format, int type, long pixels) {
        GL11C.nglTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") long pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels) {
        GL11C.nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") long pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") DoubleBuffer pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glCopyTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLint") int border) {
        GL11C.glCopyTexImage1D(target, level, internalFormat, x, y, width, border);
    }

    public static void glCopyTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalFormat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border) {
        GL11C.glCopyTexImage2D(target, level, internalFormat, x, y, width, height, border);
    }

    public static void glCopyTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        GL11C.glCopyTexSubImage1D(target, level, xoffset, x, y, width);
    }

    public static void glCopyTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL11C.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    public static void glTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL11C.glTexParameteri(target, pname, param);
    }

    public static void nglTexParameteriv(int target, int pname, long params) {
        GL11C.nglTexParameteriv(target, pname, params);
    }

    public static void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL11C.glTexParameteriv(target, pname, params);
    }

    public static void glTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        GL11C.glTexParameterf(target, pname, param);
    }

    public static void nglTexParameterfv(int target, int pname, long params) {
        GL11C.nglTexParameterfv(target, pname, params);
    }

    public static void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        GL11C.glTexParameterfv(target, pname, params);
    }

    public static void nglTexSubImage1D(int target, int level, int xoffset, int width, int format, int type, long pixels) {
        GL11C.nglTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        GL11C.nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static native void glTranslatef(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    public static native void glTranslated(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    public static native void glVertex2f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    public static native void glVertex2s(@NativeType("GLshort") short x, @NativeType("GLshort") short y);

    public static native void glVertex2i(@NativeType("GLint") int x, @NativeType("GLint") int y);

    public static native void glVertex2d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    public static native void nglVertex2fv(long coords);

    public static void glVertex2fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        if (CHECKS) {
            check(coords, 2);
        }
        nglVertex2fv(memAddress(coords));
    }

    public static native void nglVertex2sv(long coords);

    public static void glVertex2sv(@NativeType("GLshort const *") ShortBuffer coords) {
        if (CHECKS) {
            check(coords, 2);
        }
        nglVertex2sv(memAddress(coords));
    }

    public static native void nglVertex2iv(long coords);

    public static void glVertex2iv(@NativeType("GLint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 2);
        }
        nglVertex2iv(memAddress(coords));
    }

    public static native void nglVertex2dv(long coords);

    public static void glVertex2dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        if (CHECKS) {
            check(coords, 2);
        }
        nglVertex2dv(memAddress(coords));
    }

    public static native void glVertex3f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    public static native void glVertex3s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z);

    public static native void glVertex3i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    public static native void glVertex3d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    public static native void nglVertex3fv(long coords);

    public static void glVertex3fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        if (CHECKS) {
            check(coords, 3);
        }
        nglVertex3fv(memAddress(coords));
    }

    public static native void nglVertex3sv(long coords);

    public static void glVertex3sv(@NativeType("GLshort const *") ShortBuffer coords) {
        if (CHECKS) {
            check(coords, 3);
        }
        nglVertex3sv(memAddress(coords));
    }

    public static native void nglVertex3iv(long coords);

    public static void glVertex3iv(@NativeType("GLint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 3);
        }
        nglVertex3iv(memAddress(coords));
    }

    public static native void nglVertex3dv(long coords);

    public static void glVertex3dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        if (CHECKS) {
            check(coords, 3);
        }
        nglVertex3dv(memAddress(coords));
    }

    public static native void glVertex4f(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w);

    public static native void glVertex4s(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z, @NativeType("GLshort") short w);

    public static native void glVertex4i(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    public static native void glVertex4d(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    public static native void nglVertex4fv(long coords);

    public static void glVertex4fv(@NativeType("GLfloat const *") FloatBuffer coords) {
        if (CHECKS) {
            check(coords, 4);
        }
        nglVertex4fv(memAddress(coords));
    }

    public static native void nglVertex4sv(long coords);

    public static void glVertex4sv(@NativeType("GLshort const *") ShortBuffer coords) {
        if (CHECKS) {
            check(coords, 4);
        }
        nglVertex4sv(memAddress(coords));
    }

    public static native void nglVertex4iv(long coords);

    public static void glVertex4iv(@NativeType("GLint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 4);
        }
        nglVertex4iv(memAddress(coords));
    }

    public static native void nglVertex4dv(long coords);

    public static void glVertex4dv(@NativeType("GLdouble const *") DoubleBuffer coords) {
        if (CHECKS) {
            check(coords, 4);
        }
        nglVertex4dv(memAddress(coords));
    }

    public static native void nglVertexPointer(int size, int type, int stride, long pointer);

    public static void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexPointer(size, type, stride, memAddress(pointer));
    }

    public static void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexPointer(size, type, stride, pointer);
    }

    public static void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexPointer(size, type, stride, memAddress(pointer));
    }

    public static void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexPointer(size, type, stride, memAddress(pointer));
    }

    public static void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglVertexPointer(size, type, stride, memAddress(pointer));
    }

    public static void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexPointer(size, GL_SHORT, stride, memAddress(pointer));
    }

    public static void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexPointer(size, GL_INT, stride, memAddress(pointer));
    }

    public static void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglVertexPointer(size, GL_FLOAT, stride, memAddress(pointer));
    }

    public static void glVertexPointer(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        nglVertexPointer(size, GL_DOUBLE, stride, memAddress(pointer));
    }

    public static void glViewport(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int w, @NativeType("GLsizei") int h) {
        GL11C.glViewport(x, y, w, h);
    }

    @NativeType("GLboolean")
    public static boolean glAreTexturesResident(@NativeType("GLuint const *") int[] textures, @NativeType("GLboolean *") ByteBuffer residences) {
        long __functionAddress = GL.getICD().glAreTexturesResident;
        if (CHECKS) {
            check(__functionAddress);
            check(residences, textures.length);
        }
        return callPPZ(textures.length, textures, memAddress(residences), __functionAddress);
    }

    public static void glClipPlane(@NativeType("GLenum") int plane, @NativeType("GLdouble const *") double[] equation) {
        long __functionAddress = GL.getICD().glClipPlane;
        if (CHECKS) {
            check(__functionAddress);
            check(equation, 4);
        }
        callPV(plane, equation, __functionAddress);
    }

    public static void glColor3sv(@NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glColor3sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor3iv(@NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glColor3iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor3fv(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glColor3fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor3dv(@NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glColor3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor3usv(@NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glColor3usv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor3uiv(@NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glColor3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor4sv(@NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glColor4sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor4iv(@NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glColor4iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor4fv(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glColor4fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor4dv(@NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glColor4dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor4usv(@NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glColor4usv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    public static void glColor4uiv(@NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glColor4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    public static void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glDrawPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(width, height, format, type, pixels, __functionAddress);
    }

    public static void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glDrawPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(width, height, format, type, pixels, __functionAddress);
    }

    public static void glDrawPixels(@NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glDrawPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(width, height, format, type, pixels, __functionAddress);
    }

    public static void glEvalCoord1fv(@NativeType("GLfloat const *") float[] u) {
        long __functionAddress = GL.getICD().glEvalCoord1fv;
        if (CHECKS) {
            check(__functionAddress);
            check(u, 1);
        }
        callPV(u, __functionAddress);
    }

    public static void glEvalCoord1dv(@NativeType("GLdouble const *") double[] u) {
        long __functionAddress = GL.getICD().glEvalCoord1dv;
        if (CHECKS) {
            check(__functionAddress);
            check(u, 1);
        }
        callPV(u, __functionAddress);
    }

    public static void glEvalCoord2fv(@NativeType("GLfloat const *") float[] u) {
        long __functionAddress = GL.getICD().glEvalCoord2fv;
        if (CHECKS) {
            check(__functionAddress);
            check(u, 2);
        }
        callPV(u, __functionAddress);
    }

    public static void glEvalCoord2dv(@NativeType("GLdouble const *") double[] u) {
        long __functionAddress = GL.getICD().glEvalCoord2dv;
        if (CHECKS) {
            check(__functionAddress);
            check(u, 2);
        }
        callPV(u, __functionAddress);
    }

    public static void glFeedbackBuffer(@NativeType("GLenum") int type, @NativeType("GLfloat *") float[] buffer) {
        long __functionAddress = GL.getICD().glFeedbackBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer.length, type, buffer, __functionAddress);
    }

    public static void glFogiv(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glFogiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, params, __functionAddress);
    }

    public static void glFogfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glFogfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, params, __functionAddress);
    }

    public static void glGenTextures(@NativeType("GLuint *") int[] textures) {
        GL11C.glGenTextures(textures);
    }

    public static void glDeleteTextures(@NativeType("GLuint const *") int[] textures) {
        GL11C.glDeleteTextures(textures);
    }

    public static void glGetClipPlane(@NativeType("GLenum") int plane, @NativeType("GLdouble *") double[] equation) {
        long __functionAddress = GL.getICD().glGetClipPlane;
        if (CHECKS) {
            check(__functionAddress);
            check(equation, 4);
        }
        callPV(plane, equation, __functionAddress);
    }

    public static void glGetFloatv(@NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL11C.glGetFloatv(pname, params);
    }

    public static void glGetIntegerv(@NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL11C.glGetIntegerv(pname, params);
    }

    public static void glGetDoublev(@NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        GL11C.glGetDoublev(pname, params);
    }

    public static void glGetLightiv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetLightiv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4);
        }
        callPV(light, pname, data, __functionAddress);
    }

    public static void glGetLightfv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetLightfv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4);
        }
        callPV(light, pname, data, __functionAddress);
    }

    public static void glGetMapiv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetMapiv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4);
        }
        callPV(target, query, data, __functionAddress);
    }

    public static void glGetMapfv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetMapfv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4);
        }
        callPV(target, query, data, __functionAddress);
    }

    public static void glGetMapdv(@NativeType("GLenum") int target, @NativeType("GLenum") int query, @NativeType("GLdouble *") double[] data) {
        long __functionAddress = GL.getICD().glGetMapdv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4);
        }
        callPV(target, query, data, __functionAddress);
    }

    public static void glGetMaterialiv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetMaterialiv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(face, pname, data, __functionAddress);
    }

    public static void glGetMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetMaterialfv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(face, pname, data, __functionAddress);
    }

    public static void glGetPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetPixelMapfv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 32);
        }
        callPV(map, data, __functionAddress);
    }

    public static void glGetPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort *") short[] data) {
        long __functionAddress = GL.getICD().glGetPixelMapusv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 32);
        }
        callPV(map, data, __functionAddress);
    }

    public static void glGetPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint *") int[] data) {
        long __functionAddress = GL.getICD().glGetPixelMapuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 32);
        }
        callPV(map, data, __functionAddress);
    }

    public static void glGetTexEnviv(@NativeType("GLenum") int env, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetTexEnviv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(env, pname, data, __functionAddress);
    }

    public static void glGetTexEnvfv(@NativeType("GLenum") int env, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetTexEnvfv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(env, pname, data, __functionAddress);
    }

    public static void glGetTexGeniv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetTexGeniv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(coord, pname, data, __functionAddress);
    }

    public static void glGetTexGenfv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetTexGenfv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4);
        }
        callPV(coord, pname, data, __functionAddress);
    }

    public static void glGetTexGendv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] data) {
        long __functionAddress = GL.getICD().glGetTexGendv;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 4);
        }
        callPV(coord, pname, data, __functionAddress);
    }

    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    public static void glGetTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        GL11C.glGetTexImage(tex, level, format, type, pixels);
    }

    public static void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL11C.glGetTexLevelParameteriv(target, level, pname, params);
    }

    public static void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL11C.glGetTexLevelParameterfv(target, level, pname, params);
    }

    public static void glGetTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL11C.glGetTexParameteriv(target, pname, params);
    }

    public static void glGetTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL11C.glGetTexParameterfv(target, pname, params);
    }

    public static void glIndexiv(@NativeType("GLint const *") int[] index) {
        long __functionAddress = GL.getICD().glIndexiv;
        if (CHECKS) {
            check(__functionAddress);
            check(index, 1);
        }
        callPV(index, __functionAddress);
    }

    public static void glIndexsv(@NativeType("GLshort const *") short[] index) {
        long __functionAddress = GL.getICD().glIndexsv;
        if (CHECKS) {
            check(__functionAddress);
            check(index, 1);
        }
        callPV(index, __functionAddress);
    }

    public static void glIndexfv(@NativeType("GLfloat const *") float[] index) {
        long __functionAddress = GL.getICD().glIndexfv;
        if (CHECKS) {
            check(__functionAddress);
            check(index, 1);
        }
        callPV(index, __functionAddress);
    }

    public static void glIndexdv(@NativeType("GLdouble const *") double[] index) {
        long __functionAddress = GL.getICD().glIndexdv;
        if (CHECKS) {
            check(__functionAddress);
            check(index, 1);
        }
        callPV(index, __functionAddress);
    }

    public static void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glInterleavedArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(format, stride, pointer, __functionAddress);
    }

    public static void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glInterleavedArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(format, stride, pointer, __functionAddress);
    }

    public static void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        long __functionAddress = GL.getICD().glInterleavedArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(format, stride, pointer, __functionAddress);
    }

    public static void glInterleavedArrays(@NativeType("GLenum") int format, @NativeType("GLsizei") int stride, @NativeType("void const *") double[] pointer) {
        long __functionAddress = GL.getICD().glInterleavedArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(format, stride, pointer, __functionAddress);
    }

    public static void glLightModeliv(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glLightModeliv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(pname, params, __functionAddress);
    }

    public static void glLightModelfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glLightModelfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(pname, params, __functionAddress);
    }

    public static void glLightiv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glLightiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(light, pname, params, __functionAddress);
    }

    public static void glLightfv(@NativeType("GLenum") int light, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glLightfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(light, pname, params, __functionAddress);
    }

    public static void glLoadMatrixf(@NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glLoadMatrixf;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

    public static void glLoadMatrixd(@NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glLoadMatrixd;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

    public static void glMap1f(@NativeType("GLenum") int target, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLfloat const *") float[] points) {
        long __functionAddress = GL.getICD().glMap1f;
        if (CHECKS) {
            check(__functionAddress);
            check(points, order * stride);
        }
        callPV(target, u1, u2, stride, order, points, __functionAddress);
    }

    public static void glMap1d(@NativeType("GLenum") int target, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int stride, @NativeType("GLint") int order, @NativeType("GLdouble const *") double[] points) {
        long __functionAddress = GL.getICD().glMap1d;
        if (CHECKS) {
            check(__functionAddress);
            check(points, stride * order);
        }
        callPV(target, u1, u2, stride, order, points, __functionAddress);
    }

    public static void glMap2f(@NativeType("GLenum") int target, @NativeType("GLfloat") float u1, @NativeType("GLfloat") float u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLfloat const *") float[] points) {
        long __functionAddress = GL.getICD().glMap2f;
        if (CHECKS) {
            check(__functionAddress);
            check(points, ustride * uorder * vstride * vorder);
        }
        callPV(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, __functionAddress);
    }

    public static void glMap2d(@NativeType("GLenum") int target, @NativeType("GLdouble") double u1, @NativeType("GLdouble") double u2, @NativeType("GLint") int ustride, @NativeType("GLint") int uorder, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLint") int vstride, @NativeType("GLint") int vorder, @NativeType("GLdouble const *") double[] points) {
        long __functionAddress = GL.getICD().glMap2d;
        if (CHECKS) {
            check(__functionAddress);
            check(points, ustride * uorder * vstride * vorder);
        }
        callPV(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points, __functionAddress);
    }

    public static void glMaterialiv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glMaterialiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(face, pname, params, __functionAddress);
    }

    public static void glMaterialfv(@NativeType("GLenum") int face, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glMaterialfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(face, pname, params, __functionAddress);
    }

    public static void glMultMatrixf(@NativeType("GLfloat const *") float[] m) {
        long __functionAddress = GL.getICD().glMultMatrixf;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

    public static void glMultMatrixd(@NativeType("GLdouble const *") double[] m) {
        long __functionAddress = GL.getICD().glMultMatrixd;
        if (CHECKS) {
            check(__functionAddress);
            check(m, 16);
        }
        callPV(m, __functionAddress);
    }

    public static void glNormal3fv(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glNormal3fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glNormal3sv(@NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glNormal3sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glNormal3iv(@NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glNormal3iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glNormal3dv(@NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glNormal3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glPixelMapfv(@NativeType("GLenum") int map, @NativeType("GLfloat const *") float[] values) {
        long __functionAddress = GL.getICD().glPixelMapfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, values.length, values, __functionAddress);
    }

    public static void glPixelMapusv(@NativeType("GLenum") int map, @NativeType("GLushort const *") short[] values) {
        long __functionAddress = GL.getICD().glPixelMapusv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, values.length, values, __functionAddress);
    }

    public static void glPixelMapuiv(@NativeType("GLenum") int map, @NativeType("GLuint const *") int[] values) {
        long __functionAddress = GL.getICD().glPixelMapuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(map, values.length, values, __functionAddress);
    }

    public static void glPrioritizeTextures(@NativeType("GLuint const *") int[] textures, @NativeType("GLfloat const *") float[] priorities) {
        long __functionAddress = GL.getICD().glPrioritizeTextures;
        if (CHECKS) {
            check(__functionAddress);
            check(priorities, textures.length);
        }
        callPPV(textures.length, textures, priorities, __functionAddress);
    }

    public static void glRasterPos2iv(@NativeType("GLint const *") int[] coords) {
        long __functionAddress = GL.getICD().glRasterPos2iv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 2);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos2sv(@NativeType("GLshort const *") short[] coords) {
        long __functionAddress = GL.getICD().glRasterPos2sv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 2);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos2fv(@NativeType("GLfloat const *") float[] coords) {
        long __functionAddress = GL.getICD().glRasterPos2fv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 2);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos2dv(@NativeType("GLdouble const *") double[] coords) {
        long __functionAddress = GL.getICD().glRasterPos2dv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 2);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos3iv(@NativeType("GLint const *") int[] coords) {
        long __functionAddress = GL.getICD().glRasterPos3iv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 3);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos3sv(@NativeType("GLshort const *") short[] coords) {
        long __functionAddress = GL.getICD().glRasterPos3sv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 3);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos3fv(@NativeType("GLfloat const *") float[] coords) {
        long __functionAddress = GL.getICD().glRasterPos3fv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 3);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos3dv(@NativeType("GLdouble const *") double[] coords) {
        long __functionAddress = GL.getICD().glRasterPos3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 3);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos4iv(@NativeType("GLint const *") int[] coords) {
        long __functionAddress = GL.getICD().glRasterPos4iv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 4);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos4sv(@NativeType("GLshort const *") short[] coords) {
        long __functionAddress = GL.getICD().glRasterPos4sv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 4);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos4fv(@NativeType("GLfloat const *") float[] coords) {
        long __functionAddress = GL.getICD().glRasterPos4fv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 4);
        }
        callPV(coords, __functionAddress);
    }

    public static void glRasterPos4dv(@NativeType("GLdouble const *") double[] coords) {
        long __functionAddress = GL.getICD().glRasterPos4dv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 4);
        }
        callPV(coords, __functionAddress);
    }

    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        GL11C.glReadPixels(x, y, width, height, format, type, pixels);
    }

    public static void glRectiv(@NativeType("GLint const *") int[] v1, @NativeType("GLint const *") int[] v2) {
        long __functionAddress = GL.getICD().glRectiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v1, 2);
            check(v2, 2);
        }
        callPPV(v1, v2, __functionAddress);
    }

    public static void glRectsv(@NativeType("GLshort const *") short[] v1, @NativeType("GLshort const *") short[] v2) {
        long __functionAddress = GL.getICD().glRectsv;
        if (CHECKS) {
            check(__functionAddress);
            check(v1, 2);
            check(v2, 2);
        }
        callPPV(v1, v2, __functionAddress);
    }

    public static void glRectfv(@NativeType("GLfloat const *") float[] v1, @NativeType("GLfloat const *") float[] v2) {
        long __functionAddress = GL.getICD().glRectfv;
        if (CHECKS) {
            check(__functionAddress);
            check(v1, 2);
            check(v2, 2);
        }
        callPPV(v1, v2, __functionAddress);
    }

    public static void glRectdv(@NativeType("GLdouble const *") double[] v1, @NativeType("GLdouble const *") double[] v2) {
        long __functionAddress = GL.getICD().glRectdv;
        if (CHECKS) {
            check(__functionAddress);
            check(v1, 2);
            check(v2, 2);
        }
        callPPV(v1, v2, __functionAddress);
    }

    public static void glSelectBuffer(@NativeType("GLuint *") int[] buffer) {
        long __functionAddress = GL.getICD().glSelectBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer.length, buffer, __functionAddress);
    }

    public static void glTexCoord1fv(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glTexCoord1fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord1sv(@NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord1sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord1iv(@NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glTexCoord1iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord1dv(@NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glTexCoord1dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord2fv(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glTexCoord2fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord2sv(@NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord2sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord2iv(@NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glTexCoord2iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord2dv(@NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glTexCoord2dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord3fv(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glTexCoord3fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord3sv(@NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord3sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord3iv(@NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glTexCoord3iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord3dv(@NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glTexCoord3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord4fv(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glTexCoord4fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord4sv(@NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glTexCoord4sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord4iv(@NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glTexCoord4iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexCoord4dv(@NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glTexCoord4dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(v, __functionAddress);
    }

    public static void glTexEnviv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTexEnviv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    public static void glTexEnvfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glTexEnvfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(target, pname, params, __functionAddress);
    }

    public static void glTexGeniv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTexGeniv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(coord, pname, params, __functionAddress);
    }

    public static void glTexGenfv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glTexGenfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(coord, pname, params, __functionAddress);
    }

    public static void glTexGendv(@NativeType("GLenum") int coord, @NativeType("GLenum") int pname, @NativeType("GLdouble const *") double[] params) {
        long __functionAddress = GL.getICD().glTexGendv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(coord, pname, params, __functionAddress);
    }

    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] pixels) {
        GL11C.glTexImage1D(target, level, internalformat, width, border, format, type, pixels);
    }

    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") double[] pixels) {
        GL11C.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    public static void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL11C.glTexParameteriv(target, pname, params);
    }

    public static void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        GL11C.glTexParameterfv(target, pname, params);
    }

    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage1D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        GL11C.glTexSubImage1D(target, level, xoffset, width, format, type, pixels);
    }

    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        GL11C.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glVertex2fv(@NativeType("GLfloat const *") float[] coords) {
        long __functionAddress = GL.getICD().glVertex2fv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 2);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex2sv(@NativeType("GLshort const *") short[] coords) {
        long __functionAddress = GL.getICD().glVertex2sv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 2);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex2iv(@NativeType("GLint const *") int[] coords) {
        long __functionAddress = GL.getICD().glVertex2iv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 2);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex2dv(@NativeType("GLdouble const *") double[] coords) {
        long __functionAddress = GL.getICD().glVertex2dv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 2);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex3fv(@NativeType("GLfloat const *") float[] coords) {
        long __functionAddress = GL.getICD().glVertex3fv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 3);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex3sv(@NativeType("GLshort const *") short[] coords) {
        long __functionAddress = GL.getICD().glVertex3sv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 3);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex3iv(@NativeType("GLint const *") int[] coords) {
        long __functionAddress = GL.getICD().glVertex3iv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 3);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex3dv(@NativeType("GLdouble const *") double[] coords) {
        long __functionAddress = GL.getICD().glVertex3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 3);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex4fv(@NativeType("GLfloat const *") float[] coords) {
        long __functionAddress = GL.getICD().glVertex4fv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 4);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex4sv(@NativeType("GLshort const *") short[] coords) {
        long __functionAddress = GL.getICD().glVertex4sv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 4);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex4iv(@NativeType("GLint const *") int[] coords) {
        long __functionAddress = GL.getICD().glVertex4iv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 4);
        }
        callPV(coords, __functionAddress);
    }

    public static void glVertex4dv(@NativeType("GLdouble const *") double[] coords) {
        long __functionAddress = GL.getICD().glVertex4dv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 4);
        }
        callPV(coords, __functionAddress);
    }

}