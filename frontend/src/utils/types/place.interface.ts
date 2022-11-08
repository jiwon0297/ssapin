export interface IPlace {
  placeId: number;
  itemId: number;
  title: string;
  lat: number;
  lng: number;
  address: string;
  reviewContent: string;
  userId: number;
  userEmoji: string;
  nickname: string;
}

export interface IPlaceMin {
  placeId: number;
  itemId: number;
  title: string;
  lat: number;
  lng: number;
  address: string;
}

export interface IPlaceRanking {
  review: IPlaceMin;
  bookmark: IPlaceMin;
  pin: IPlaceMin;
}

export interface IKakaoPlace {
  address_name: string;
  category_group_code: string;
  category_group_name: string;
  category_name: string;
  distance: string;
  id: string;
  phone: string;
  place_name: string;
  place_url: string;
  road_address_name: string;
  x: string;
  y: string;
}

export interface IPlaceRequestBody {
  mapId: number;
  place: IPlaceMin;
}
