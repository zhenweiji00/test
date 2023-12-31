## EishayParseBinary
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	fastjson2UTF8Bytes	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	1607.78	|	1136.893 (70.71%)	|	277.884 (17.28%)	|	47.109 (2.93%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	2634.393	|	1153.482 (43.79%)	|	248.788 (9.44%)	|	47.035 (1.79%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	3291.401	|	1256.046 (38.16%)	|	256.689 (7.8%)	|	53.528 (1.63%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	1441.871	|	868.158 (60.21%)	|	209.732 (14.55%)	|	43.271 (3%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	2127.613	|	1055.331 (49.6%)	|	205.147 (9.64%)	|	38.042 (1.79%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	2317.905	|	1113.136 (48.02%)	|	214.448 (9.25%)	|	40.139 (1.73%) |

## EishayParseBinaryArrayMapping
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	kryo	|	fastjson2UTF8Bytes	|	fastjson1UTF8Bytes |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	2700.196	|	1708.857 (63.29%)	|	1652.771 (61.21%)	|	1450.264 (53.71%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	4007.588	|	1615.608 (40.31%)	|	1866.408 (46.57%)	|	1480.299 (36.94%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	4993.834	|	1667.858 (33.4%)	|	1989.139 (39.83%)	|	1671.14 (33.46%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	2443.28	|	1264.145 (51.74%)	|	1235.673 (50.57%)	|	1153.475 (47.21%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	3209.524	|	1412.601 (44.01%)	|	1519.214 (47.33%)	|	1266.053 (39.45%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	3367.038	|	1193.729 (35.45%)	|	1585.944 (47.1%)	|	1362.375 (40.46%) |

## EishayParseBinaryAutoType
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	fastjson2JSONB_autoTypeFilter	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	1464.309	|	1377.341 (94.06%)	|	280.204 (19.14%)	|	47.065 (3.21%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	1899.668	|	1659.486 (87.36%)	|	246.162 (12.96%)	|	48.605 (2.56%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	2093.44	|	1860.553 (88.88%)	|	255.654 (12.21%)	|	53.668 (2.56%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	1203.799	|	1164.723 (96.75%)	|	208.199 (17.3%)	|	42.628 (3.54%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	1639.166	|	1565.655 (95.52%)	|	204.995 (12.51%)	|	40.342 (2.46%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	1664.856	|	1500.395 (90.12%)	|	222.805 (13.38%)	|	40.502 (2.43%) |

## EishayParseString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	1270.222	|	999.901 (78.72%)	|	513.855 (40.45%)	|	434.542 (34.21%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	1221.339	|	903.857 (74.01%)	|	481.869 (39.45%)	|	448.803 (36.75%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	1305.405	|	1268.464 (97.17%)	|	514.007 (39.38%)	|	441.141 (33.79%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	968.769	|	781.177 (80.64%)	|	373.504 (38.55%)	|	353.012 (36.44%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	1092.265	|	814.162 (74.54%)	|	385.06 (35.25%)	|	373.121 (34.16%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	1104.301	|	1114.575 (100.93%)	|	416.922 (37.75%)	|	309.98 (28.07%) |

## EishayParseStringPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	925.665	|	264.483 (28.57%)	|	483.362 (52.22%)	|	406.077 (43.87%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	893.726	|	242.872 (27.18%)	|	443.597 (49.63%)	|	411.759 (46.07%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	940.402	|	296.614 (31.54%)	|	456.222 (48.51%)	|	418.299 (44.48%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	753.146	|	223.936 (29.73%)	|	343.473 (45.61%)	|	331.186 (43.97%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	783.782	|	234.665 (29.94%)	|	369.382 (47.13%)	|	349.565 (44.6%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	805.205	|	261.995 (32.54%)	|	351.669 (43.67%)	|	325.931 (40.48%) |

## EishayParseTreeString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	950.291	|	518.64 (54.58%)	|	527.35 (55.49%)	|	338.44 (35.61%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	832.811	|	402.992 (48.39%)	|	475.082 (57.05%)	|	326.405 (39.19%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	1008.146	|	543.685 (53.93%)	|	509.041 (50.49%)	|	308.374 (30.59%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	562.055	|	301.023 (53.56%)	|	296.477 (52.75%)	|	280.22 (49.86%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	767.106	|	365.11 (47.6%)	|	364.941 (47.57%)	|	277.357 (36.16%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	812.884	|	408.606 (50.27%)	|	406.841 (50.05%)	|	272.602 (33.54%) |

## EishayParseTreeStringPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	794.339	|	446.662 (56.23%)	|	478.137 (60.19%)	|	318.817 (40.14%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	644.828	|	350.331 (54.33%)	|	421.684 (65.39%)	|	309.224 (47.95%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	800.181	|	491.538 (61.43%)	|	488.748 (61.08%)	|	296.999 (37.12%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	510.755	|	289.429 (56.67%)	|	294.365 (57.63%)	|	250.973 (49.14%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	640.778	|	287.546 (44.87%)	|	337.907 (52.73%)	|	288.055 (44.95%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	637.166	|	358.329 (56.24%)	|	370.411 (58.13%)	|	281.944 (44.25%) |

## EishayParseTreeUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	860.003	|	434.671 (50.54%)	|	589.215 (68.51%)	|	315.208 (36.65%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	759.632	|	357.689 (47.09%)	|	539.943 (71.08%)	|	316.399 (41.65%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	1011.872	|	473.271 (46.77%)	|	577.8 (57.1%)	|	318.518 (31.48%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	561.084	|	266.328 (47.47%)	|	331.324 (59.05%)	|	253.09 (45.11%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	743.791	|	280.253 (37.68%)	|	452.766 (60.87%)	|	294.721 (39.62%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	780.003	|	359.179 (46.05%)	|	465.168 (59.64%)	|	290.502 (37.24%) |

## EishayParseTreeUTF8BytesPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	708.02	|	370.865 (52.38%)	|	502.259 (70.94%)	|	294.258 (41.56%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	672.696	|	309.247 (45.97%)	|	482.188 (71.68%)	|	299.508 (44.52%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	781.104	|	402.912 (51.58%)	|	513.824 (65.78%)	|	293.206 (37.54%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	483.824	|	243.255 (50.28%)	|	303.502 (62.73%)	|	238.942 (49.39%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	625.928	|	254.714 (40.69%)	|	390.025 (62.31%)	|	276.786 (44.22%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	632.635	|	284.153 (44.92%)	|	426.187 (67.37%)	|	276.239 (43.66%) |

## EishayParseUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	dsljson	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	1080.859	|	866.501 (80.17%)	|	797.66 (73.8%)	|	593.107 (54.87%)	|	312.904 (28.95%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	1091.665	|	851.206 (77.97%)	|	758.563 (69.49%)	|	558.21 (51.13%)	|	319.498 (29.27%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	1189.116	|	811.928 (68.28%)	|	965.285 (81.18%)	|	547.35 (46.03%)	|	318.003 (26.74%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	853.442	|	678.22 (79.47%)	|	674.485 (79.03%)	|	423.917 (49.67%)	|	253.461 (29.7%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	1005.951	|	641.544 (63.77%)	|	670.202 (66.62%)	|	450.984 (44.83%)	|	301.138 (29.94%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	1043.1	|	642.128 (61.56%)	|	472.808 (45.33%)	|	466.391 (44.71%)	|	285.041 (27.33%) |

## EishayParseUTF8BytesPretty
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	834.825	|	245.252 (29.38%)	|	531.441 (63.66%)	|	287.756 (34.47%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	856.288	|	225.666 (26.35%)	|	504.944 (58.97%)	|	293.765 (34.31%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	884.189	|	271.344 (30.69%)	|	502.649 (56.85%)	|	298.029 (33.71%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	692.789	|	205.372 (29.64%)	|	397.612 (57.39%)	|	239.703 (34.6%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	750.672	|	171.395 (22.83%)	|	304.668 (40.59%)	|	280.511 (37.37%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	757.025	|	243.817 (32.21%)	|	415.245 (54.85%)	|	278.15 (36.74%) |

## EishayWriteBinary
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	fastjson2UTF8Bytes	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	1933.156	|	1528.751 (79.08%)	|	336.396 (17.4%)	|	215.024 (11.12%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	2443.002	|	1585.01 (64.88%)	|	333.228 (13.64%)	|	212.443 (8.7%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	3415.736	|	1970.948 (57.7%)	|	324.074 (9.49%)	|	225.496 (6.6%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	1658.478	|	1336.548 (80.59%)	|	361.165 (21.78%)	|	208.091 (12.55%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	2168.577	|	1446.49 (66.7%)	|	349.706 (16.13%)	|	219.313 (10.11%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	2129.2	|	1444.238 (67.83%)	|	347.901 (16.34%)	|	207.379 (9.74%) |

## EishayWriteBinaryArrayMapping
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	kryo	|	fastjson2UTF8Bytes	|	fastjson1UTF8Bytes |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	3048.846	|	1891.255 (62.03%)	|	1902.454 (62.4%)	|	741.971 (24.34%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	4624.54	|	1912.048 (41.35%)	|	2025.551 (43.8%)	|	697.849 (15.09%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	5668.132	|	1863.732 (32.88%)	|	2138.841 (37.73%)	|	705.561 (12.45%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	2645.46	|	1450.567 (54.83%)	|	1552.157 (58.67%)	|	477.12 (18.04%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	4230.143	|	1571.09 (37.14%)	|	1710.407 (40.43%)	|	472.101 (11.16%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	4065.113	|	1446.461 (35.58%)	|	1698.641 (41.79%)	|	501.494 (12.34%) |

## EishayWriteBinaryAutoType
| aliyun ecs spec | jdk version 	|	fastjson2JSONB	|	fastjson2UTF8Bytes	|	hessian	|	javaSerialize |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	1361.603	|	1474.756 (108.31%)	|	339.193 (24.91%)	|	228.327 (16.77%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	1423.52	|	1559.814 (109.57%)	|	336.84 (23.66%)	|	215.171 (15.12%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	1718.396	|	1835.038 (106.79%)	|	324.614 (18.89%)	|	224.87 (13.09%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	1098.351	|	1303.171 (118.65%)	|	355.222 (32.34%)	|	205.451 (18.71%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	1332.979	|	1144.413 (85.85%)	|	352.54 (26.45%)	|	218.537 (16.39%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	1288.64	|	1379.08 (107.02%)	|	350.356 (27.19%)	|	211.882 (16.44%) |

## EishayWriteString
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	1628.128	|	613.657 (37.69%)	|	957.133 (58.79%)	|	430.566 (26.45%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	1418.317	|	596.202 (42.04%)	|	930.554 (65.61%)	|	364.02 (25.67%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	1637.516	|	618.914 (37.8%)	|	1028.977 (62.84%)	|	241.72 (14.76%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	1251.235	|	478.011 (38.2%)	|	649.197 (51.88%)	|	354.841 (28.36%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	1324.587	|	464.678 (35.08%)	|	598.053 (45.15%)	|	299.923 (22.64%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	1306.628	|	488.09 (37.35%)	|	621.316 (47.55%)	|	214.083 (16.38%) |

## EishayWriteStringTree
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	1254.718	|	811.631 (64.69%)	|	921.259 (73.42%)	|	482.49 (38.45%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	1154.395	|	778.185 (67.41%)	|	957.245 (82.92%)	|	392.818 (34.03%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	1173.254	|	816.578 (69.6%)	|	874.972 (74.58%)	|	256.64 (21.87%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	955.013	|	580.809 (60.82%)	|	647.285 (67.78%)	|	410.806 (43.02%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	1091.615	|	621.679 (56.95%)	|	726.939 (66.59%)	|	361.652 (33.13%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	1089.15	|	644.583 (59.18%)	|	687.586 (63.13%)	|	230.999 (21.21%) |

## EishayWriteStringTree1x
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	1110.173	|	789.242 (71.09%)	|	872.548 (78.6%)	|	476.555 (42.93%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	1147.334	|	737.267 (64.26%)	|	886.593 (77.27%)	|	370.912 (32.33%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	902.804	|	720.385 (79.79%)	|	773.387 (85.66%)	|	249.054 (27.59%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	829.157	|	561.505 (67.72%)	|	627.016 (75.62%)	|	393.751 (47.49%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	946.439	|	576.51 (60.91%)	|	705.601 (74.55%)	|	330.224 (34.89%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	780.511	|	558.855 (71.6%)	|	629.559 (80.66%)	|	217.352 (27.85%) |

## EishayWriteUTF8Bytes
| aliyun ecs spec | jdk version 	|	fastjson2	|	fastjson1	|	jackson	|	gson |
|-----|-----|----------|----------|----------|-----|
| ecs.c7.xlarge | oracle-jdk1.8.0_341_x64	|	1510.835	|	564.251 (37.35%)	|	897.814 (59.43%)	|	372.801 (24.68%) |
| ecs.c7.xlarge | oracle-jdk-11.0.16_x64	|	1608.006	|	529.233 (32.91%)	|	834.098 (51.87%)	|	348.909 (21.7%) |
| ecs.c7.xlarge | oracle-jdk-17.0.4_x64	|	1941.591	|	571.335 (29.43%)	|	959.965 (49.44%)	|	242.635 (12.5%) |
| ecs.g8m.xlarge | oracle-jdk1.8.0_341_aarch64	|	1336.936	|	462.741 (34.61%)	|	667.406 (49.92%)	|	308.688 (23.09%) |
| ecs.g8m.xlarge | oracle-jdk-11.0.16_aarch64	|	1438.388	|	413.648 (28.76%)	|	612.0 (42.55%)	|	308.221 (21.43%) |
| ecs.g8m.xlarge | oracle-jdk-17.0.4_aarch64	|	1415.558	|	446.263 (31.53%)	|	668.081 (47.2%)	|	211.145 (14.92%) |
