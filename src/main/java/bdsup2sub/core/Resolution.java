/*
 * Copyright 2014 Miklos Juhasz (mjuhasz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package bdsup2sub.core;

public enum Resolution {
    NTSC {
        @Override
        public String toString() {
            return "NTSC (720x480)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "480i";
        }

        @Override
        public int[] getDimensions() {
            return new int[] {720, 480};
        }
    },
    PAL {
        @Override
        public String toString() {
            return "PAL (720x576)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "576i";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{720, 576};
        }
    },
    SD_720x404 {
        @Override
        public String toString() {
            return "404p (720x404)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "720x404";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{720, 404};
        }
    },
    HD_1280x528 {
        @Override
        public String toString() {
            return "528p (1280x528)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1280x528";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1280, 528};
        }
    },
    HD_1280x533 {
        @Override
        public String toString() {
            return "533p (1280x533)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1280x533";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1280, 533};
        }
    },
    HD_1280x534 {
        @Override
        public String toString() {
            return "534p (1280x534)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1280x534";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1280, 534};
        }
    },
    HD_1280x536 {
        @Override
        public String toString() {
            return "536p (1280x536)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1280x536";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1280, 536};
        }
    },
    HD_1280x544 {
        @Override
        public String toString() {
            return "544p (1280x544)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1280x544";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1280, 544};
        }
    },
    HD_1280x545 {
        @Override
        public String toString() {
            return "545p (1280x545)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1280x545";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1280, 545};
        }
    },
    HD_1280x576 {
        @Override
        public String toString() {
            return "576p (1280x576)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1280x576";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1280, 576};
        }
    },
    HD_1280x688 {
        @Override
        public String toString() {
            return "688p (1280x688)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1280x688";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1280, 688};
        }
    },
    HD_1280x692 {
        @Override
        public String toString() {
            return "692p (1280x692)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1280x692";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1280, 692};
        }
    },
    HD_720 {
        @Override
        public String toString() {
            return "720p (1280x720)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "720p";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1280, 720};
        }
    },
    HD_1440x1080 {
        @Override
        public String toString() {
            return "1080p (1440x1080)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1440x1080";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1440, 1080};
        }
    },
    HD_1920x800 {
        @Override
        public String toString() {
            return "800p (1920x800)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1920x800";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1920, 800};
        }
    },
    HD_1920x816 {
        @Override
        public String toString() {
            return "816p (1920x816)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1920x816";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1920, 816};
        }
    },
    HD_1920x817 {
        @Override
        public String toString() {
            return "817p (1920x817)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1920x817";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1920, 817};
        }
    },
    HD_1920x864 {
        @Override
        public String toString() {
            return "864p (1920x864)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1920x864";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1920, 864};
        }
    },
    HD_1920x1038 {
        @Override
        public String toString() {
            return "1038p (1920x1038)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1920x1038";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1920, 1038};
        }
    },
    HD_1920x1040 {
        @Override
        public String toString() {
            return "1040p (1920x1040)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1920x1040";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1920, 1040};
        }
    },
    HD_1080 {
        @Override
        public String toString() {
            return "1080p (1920x1080)";
        }

        @Override
        public String getResolutionNameForXml() {
            return "1080p";
        }

        @Override
        public int[] getDimensions() {
            return new int[]{1920, 1080};
        }
    };

    public abstract String getResolutionNameForXml();
    public abstract int[] getDimensions();
}
